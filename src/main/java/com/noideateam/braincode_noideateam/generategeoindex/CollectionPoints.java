package com.noideateam.braincode_noideateam.generategeoindex;

import com.javadocmd.simplelatlng.LatLng;
import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LengthUnit;
import com.noideateam.braincode_noideateam.CollectionPoint;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
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
            CollectionPoint cp = new CollectionPoint(r[0], r[1], r[2], r[3], r[4], r[5], r[6], r[7], r[8]);
            collectionPoints.add(cp);

            for (CollectionPoint e : collectionPoints) {
                System.out.println("Name: " + e.getName() + " (" + e.getLatitude() + ", " + e.getLongitude() + ") ");
            }
        }
    }

    static Vector<Double> collectionPointsDistanceToPoint(float x, float y) {
        Vector<Double> distances = new Vector<>();
        LatLng sourcePoint = new LatLng(x, y);
        for (CollectionPoint e : collectionPoints) {
            LatLng targetPoint = new LatLng(e.getLatitude(), e.getLongitude());
            distances.add(LatLngTool.distance(sourcePoint, targetPoint, LengthUnit.KILOMETER));
        }
        return distances;
    }

}
