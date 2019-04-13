package com.noideateam.braincode_noideateam.restreturn;

/**
 * @author Dawid Nogacz on 13.04.2019
 */
public class BetterLocation {
    private String pointName;
    private double distance;
    private boolean suggest;
    private String street;
    private String city;
    private String zip;



    public BetterLocation(String pointName, double distance, boolean suggest, String better_street, String better_city, String better_zip) {
        this.pointName = pointName;
        this.distance = distance;
        this.suggest = suggest;
        this.street = better_street;
        this.city = better_city;
        this.zip = better_zip;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
