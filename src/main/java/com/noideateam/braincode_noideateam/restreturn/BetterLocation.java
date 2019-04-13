package com.noideateam.braincode_noideateam.restreturn;

/**
 * @author Dawid Nogacz on 13.04.2019
 */
public class BetterLocation {
    private String pointName;
    private double distance;
    private boolean suggest;

    public BetterLocation(String pointName, double distance, boolean suggest) {
        this.pointName = pointName;
        this.distance = distance;
        this.suggest = suggest;
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

    public boolean isSuggest() {
        return suggest;
    }

    public void setSuggest(boolean suggest) {
        this.suggest = suggest;
    }
}
