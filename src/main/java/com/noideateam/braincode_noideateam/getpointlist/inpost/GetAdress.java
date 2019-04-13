package com.noideateam.braincode_noideateam.getpointlist.inpost;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAdress {
    @JsonProperty("city")
    private String city;
    @JsonProperty("post_code")
    private String postCode;
    @JsonProperty("building_number")
    private String houseNumber;
    @JsonProperty("street")
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "GetAdress{" +
                "city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}