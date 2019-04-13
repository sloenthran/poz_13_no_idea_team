package com.noideateam.braincode_noideateam.restreturn;

/**
 * @author Dawid Nogacz on 13.04.2019
 */
public class OriginalLocation {
    private String pointName;
    private double distance;

    public OriginalLocation(String pointName, double distance) {
        this.pointName = pointName;
        this.distance = distance;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
