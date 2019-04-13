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
    private String notes;
    private String shopType;
    private String deliveryHours;



    public BetterLocation(String pointName, double distance, boolean suggest, String better_street,
                          String better_city, String better_zip, String notes, String shopType, String deliveryHours) {
        this.pointName = pointName;
        this.distance = distance;
        this.suggest = suggest;
        this.street = better_street;
        this.city = better_city;
        this.zip = better_zip;
        this.notes = notes;
        this.shopType = shopType;
        this.deliveryHours = deliveryHours;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public String getShopType() {
        String returnType;

        switch(shopType) {
            case "UPS": returnType = "UPS"; break;
            case "POCZTA_POLSKA_ZABKA": returnType = "ZABKA"; break;
            case "RUCH": returnType = "RUCH"; break;
            case "POCZTA_POLSKA_ORLEN": returnType = "ORLEN"; break;
            case "POCZTA_POLSKA": returnType = "POCZTA_POLSKA"; break;
            case "PACZKOMAT": returnType = "PACZKOMAT"; break;
            default: returnType = "null"; break;
        }

        return returnType;
    }

    public String getDeliveryHours() {
        return this.deliveryHours;
    }
}
