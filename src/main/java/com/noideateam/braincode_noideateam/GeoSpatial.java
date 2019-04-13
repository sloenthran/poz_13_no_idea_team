package com.noideateam.braincode_noideateam;

import java.io.IOException;
import java.util.Map;

public class GeoSpatial {
//    static LatLng point = new LatLng(52.36904525756836, 16.932106018066406);
//    static LatLng point2 = new LatLng(52.47749710083008, 16.784605026245117);
//    static double distanceKm = LatLngTool.distance(point, point2, LengthUnit.KILOMETER);

    static CollectionPoints collectionPoints;

    static {
        try {
            collectionPoints = new CollectionPoints();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void pointsInRangeAroundPoint(float lon, float lat, float range){
    }

    public static void main(String[] args) throws IOException {

        Map<CollectionPoint, Double> result= CollectionPoints.collectionPointsInRange(16.89326, 52.44955, 10);
        result.forEach((key,value) -> {
            System.out.println("key = " + key.getName() + " " + value);
        });
    }

}
