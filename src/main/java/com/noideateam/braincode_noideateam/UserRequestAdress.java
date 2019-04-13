package com.noideateam.braincode_noideateam;

import com.noideateam.braincode_noideateam.generategeoindex.GenerateGeoIndex;
import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.ReturnGenerateGeoIndex;

public class UserRequestAdress {

    private String login;
    private String street;
    private String city;
    private String zip;
    private ReturnGenerateGeoIndex geoIndex;


    public UserRequestAdress(String login, String street, String city, String zip) {
        this.login = login;
        this.street = street;
        this.city = city;
        this.zip = zip;

        GenerateGeoIndex generateGeoIndex = new GenerateGeoIndex(street, city, zip);
        this.geoIndex = generateGeoIndex.generate();
    }

    public String getLogin() {
        return login;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public ReturnGenerateGeoIndex getGeoIndex() {
        return geoIndex;
    }
}
