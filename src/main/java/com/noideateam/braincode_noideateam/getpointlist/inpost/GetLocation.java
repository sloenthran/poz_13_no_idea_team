package com.noideateam.braincode_noideateam.getpointlist.inpost;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetLocation {
    @JsonProperty("latitude")
    private float latitude;
    @JsonProperty("longtitude")
    private float longtitude;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    @Override
    public String toString() {
        return "GetLocation{" +
                "latitude=" + latitude +
                ", longtitude=" + longtitude +
                '}';
    }
}
