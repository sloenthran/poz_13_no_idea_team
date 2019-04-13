package com.noideateam.braincode_noideateam.restreturn;

/**
 * @author Dawid Nogacz on 13.04.2019
 */
public class OriginalLocation {
//    private String pointName;
    private double distance;
    private String street;
    private String city;
    private String zip;


    public OriginalLocation(double distance, String street, String city, String zip) {
        //this.pointName = pointName;
        this.distance = distance;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

//    public String getPointName() {
//        return pointName;
//    }
//
//    public void setPointName(String pointName) {
//        this.pointName = pointName;
//    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
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
