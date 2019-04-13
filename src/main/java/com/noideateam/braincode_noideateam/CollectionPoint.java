package com.noideateam.braincode_noideateam;

public class CollectionPoint {
    //Typ	Nazwa	Adres	Kod pocztowy	Miasto	Szerokość geograficzna	Długość geograficzna	Godziny odbioru	Uwagi
    private String type;
    private String name;
    private String address;
    private String zipCode;
    private String city;
    private Double latitude; // szerokość
    private Double longitude; // długość
    private String deliveryHours;
    private String notes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = Double.valueOf(latitude);
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = Double.valueOf(longitude);
    }

    public String getDeliveryHours() {
        return deliveryHours;
    }

    public void setDeliveryHours(String deliveryHours) {
        this.deliveryHours = deliveryHours;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public CollectionPoint(String type, String name, String address, String zipCode, String city, String latitude, String longitude, String deliveryHours, String notes) {
        this.type = type;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.latitude = Double.valueOf(latitude);
        this.longitude = Double.valueOf(longitude);
        this.deliveryHours = deliveryHours;
        this.notes = notes;
    }
}