package com.noideateam.braincode_noideateam;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class GeoSpatial {
//    static LatLng point = new LatLng(52.36904525756836, 16.932106018066406);
//    static LatLng point2 = new LatLng(52.47749710083008, 16.784605026245117);
//    static double distanceKm = LatLngTool.distance(point, point2, LengthUnit.KILOMETER);

    static Vector<CollectionPoint> collectionPoints = new Vector<>();

    public static void main(String[] args) throws IOException {
        initializeCollectionPoints();
    }

    private static void initializeCollectionPoints() throws IOException {
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
}
