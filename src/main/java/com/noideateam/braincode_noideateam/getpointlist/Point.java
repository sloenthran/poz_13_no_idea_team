package com.noideateam.braincode_noideateam.getpointlist;

import com.noideateam.braincode_noideateam.generategeoindex.ZIPCode;

public class Point {
    private float x;
    private float y;
    private String street;
    private String city;
    private ZIPCode zipCode;

    public Point(float x, float y, String street, String city, ZIPCode zipCode) {
        this.x = x;
        this.y = y;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
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

    public ZIPCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZIPCode zipCode) {
        this.zipCode = zipCode;
    }
}
