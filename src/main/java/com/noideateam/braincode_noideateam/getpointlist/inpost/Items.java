package com.noideateam.braincode_noideateam.getpointlist.inpost;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items {
    @JsonProperty("location")
    private GetLocation location;
    @JsonProperty("address_details")
    private GetAdress adress;

    public GetLocation getLocation() {
        return location;
    }

    public void setLocation(GetLocation location) {
        this.location = location;
    }

    public GetAdress getAdress() {
        return adress;
    }

    public void setGetAdress(GetAdress getAdress) {
        this.adress = getAdress;
    }

    @Override
    public String toString() {
        return "Response{" +
                "location=" + location +
                ", adress=" + adress +
                '}';
    }
}