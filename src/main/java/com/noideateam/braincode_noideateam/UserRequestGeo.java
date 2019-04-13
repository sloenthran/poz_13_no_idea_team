package com.noideateam.braincode_noideateam;

public class UserRequestGeo {
    private String login;
    private float geoLength;
    private float geoWidth;

    public UserRequestGeo(String login, float geoLength, float geoWidth) {
        this.login = login;
        this.geoLength = geoLength;
        this.geoWidth = geoWidth;
    }

    public String getLogin() {
        return login;
    }

    public float getGeoLength() {
        return geoLength;
    }

    public float getGeoWidth() {
        return geoWidth;
    }
}