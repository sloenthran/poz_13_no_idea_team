package com.noideateam.braincode_noideateam.generategeoindex;

import com.javadocmd.simplelatlng.LatLng;
import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LengthUnit;
import com.noideateam.braincode_noideateam.CollectionPoint;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

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

    public double getDistance(double sourceX, double sourceY, double tagetX, double targetY ){
        LatLng sourcePoint = new LatLng(sourceX, sourceY);
        LatLng targetPoint = new LatLng(tagetX, targetY);

        return LatLngTool.distance(sourcePoint, targetPoint, LengthUnit.KILOMETER);
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


    public Optional<Map.Entry<CollectionPoint, Double>> getClosest(double X, double Y){



        Map<CollectionPoint, Double> result= CollectionPoints.collectionPointsInRange(X, Y, 10);
        double min = Collections.min(result.values());
        System.out.println("Min: " + min);


//        result.forEach((key,value) -> {
//            System.out.println("key = " + key.getName() + " " + value);
//        });

        Optional<Map.Entry<CollectionPoint, Double>> something = result.entrySet().stream().min(Map.Entry.comparingByValue());

        System.out.println("cmp point: "+ something.get().getKey().getName() + "\t"+ something.get().getValue());

        return something;

    }

    public Stream<CollectionPoint> keys(Map<CollectionPoint, Double> map, Double value){
        return map
                .entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey);
    }

}
