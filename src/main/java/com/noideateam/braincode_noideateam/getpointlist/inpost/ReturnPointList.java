package com.noideateam.braincode_noideateam.getpointlist.inpost;

import com.noideateam.braincode_noideateam.generategeoindex.ZIPCode;
import com.noideateam.braincode_noideateam.getpointlist.Point;
import java.util.ArrayList;

public class ReturnPointList {
    ArrayList<Point> points = new ArrayList<>();

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void addPoint(float x, float y, String street, String city, String zipcode) {
        points.add(new Point(x, y, street, city, new ZIPCode(zipcode)));
    }

    @Override
    public String toString() {
        return "ReturnPointList{" +
                "points=" + points +
                '}';
    }
}
