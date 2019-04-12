package com.noideateam.braincode_noideateam.generategeoindex;

public class GenerateGeoIndex {
    private String street;
    private String city;
    private ZIPCode zipCode;

    public GenerateGeoIndex(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = new ZIPCode(zipCode);
    }


}
