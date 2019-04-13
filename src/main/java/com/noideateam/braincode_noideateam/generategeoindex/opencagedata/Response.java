package com.noideateam.braincode_noideateam.generategeoindex.opencagedata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response {
    @JsonProperty("results")
    private List<GetResults> results;

    public List<GetResults> getResults() {
        return results;
    }

    public void setResults(List<GetResults> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Response{" +
                "results=" + results +
                '}';
    }
}
