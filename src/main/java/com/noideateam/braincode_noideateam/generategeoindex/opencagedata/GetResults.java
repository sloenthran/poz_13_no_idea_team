package com.noideateam.braincode_noideateam.generategeoindex.opencagedata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResults {
    @JsonProperty("geometry")
    private GetGeometry geometry;
    @JsonProperty("formatted")
    private String formated;

    public GetGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(GetGeometry geometry) {
        this.geometry = geometry;
    }

    public String getFormated() {
        return formated;
    }

    public void setFormated(String formated) {
        this.formated = formated;
    }

    @Override
    public String toString() {
        return "GetResults{" +
                "geometry=" + geometry +
                ", formated='" + formated + '\'' +
                '}';
    }
}
