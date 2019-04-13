package com.noideateam.braincode_noideateam.getpointlist.inpost;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Response {
    @JsonProperty
    private List<Items> items;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Response{" +
                "items=" + items +
                '}';
    }
}