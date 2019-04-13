package com.noideateam.braincode_noideateam.generategeoindex.opencagedata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResults {
    @JsonProperty("geometry")
    private GetGeometry geometry;

    public GetGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(GetGeometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "GetResults{" +
                "geometry=" + geometry +
                '}';
    }
}
