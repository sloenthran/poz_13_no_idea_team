package com.noideateam.braincode_noideateam.generategeoindex;

import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.Query;
import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.ReturnGenerateGeoIndex;

public class GenerateGeoIndex {
    private String street;
    private String city;
    private ZIPCode zipCode;

    public GenerateGeoIndex(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = new ZIPCode(zipCode);
    }

    public ReturnGenerateGeoIndex askOpenCageData() {
        String street = this.street.replace(" ","+");
        Query query = new Query();
        return query.ask(street + "+" + city + "+" + zipCode.getZipCode());
    }

    public ReturnGenerateGeoIndex generate() {
        return this.askOpenCageData();
    }
}