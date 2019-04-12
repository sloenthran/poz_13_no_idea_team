package com.noideateam.braincode_noideateam.generategeoindex.opencagedata;

public class GetGeometry {
    private float lat;
    private float lng;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "GetGeometry{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
