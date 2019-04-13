package com.noideateam.braincode_noideateam;

import com.javadocmd.simplelatlng.LatLng;
import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LengthUnit;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CollectionPoints {

    static Vector<CollectionPoint> collectionPoints = new Vector<>();

    public CollectionPoints() throws IOException {
        initializeCollectionPoints();
    }

    public static void initializeCollectionPoints() throws IOException {
        CSVReader values = new CSVReader(new FileReader("pickup_points_small_unique.csv"), ';');
        String[] r;
        while ((r = values.readNext()) != null) {
            if(r[0].equals("Typ")){ continue; }
            CollectionPoint cp = new CollectionPoint(r[0], r[1], r[2], r[3], r[4], r[5], r[6], r[7], r[8]);
            collectionPoints.add(cp);

            for (CollectionPoint e : collectionPoints) {

//                System.out.println("Name: " + e.getName() + " (" + e.getLatitude() + ", " + e.getLongitude() + ") ");
            }
        }
    }

    static Map<CollectionPoint, Double> collectionPointsDistanceToPoint(double x, double y) {
        Map<CollectionPoint, Double> result = new HashMap<>();
        LatLng sourcePoint = new LatLng(x, y);
        for (CollectionPoint e : collectionPoints) {
            LatLng targetPoint = new LatLng(e.getLongitude(), e.getLatitude());
            double distance = LatLngTool.distance(sourcePoint, targetPoint, LengthUnit.KILOMETER);
            result.put(e, distance);
        }
        return result;
    }

    public static Map<CollectionPoint, Double> collectionPointsInRange(double x, double y, float range){
        Map<CollectionPoint, Double> distances = collectionPointsDistanceToPoint(x, y);
        Map<CollectionPoint, Double> result = new HashMap<>();
        distances.forEach((key, value) -> {
            if(value < range){
               result.put(key, value);
            }
        });
        return result;
    }

}
