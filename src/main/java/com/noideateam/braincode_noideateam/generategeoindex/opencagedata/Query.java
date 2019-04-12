package com.noideateam.braincode_noideateam.generategeoindex.opencagedata;

import org.springframework.web.client.RestTemplate;

public class Query {
    public ReturnData ask(String localization) {
        RestTemplate restTemplate = new RestTemplate();

        String fooResourceUrl = "https://api.opencagedata.com/geocode/v1/json?q=" + localization + "&key=ee5278cc22494f74b5ecbd782c2e4661&pretty=1";
        Response response = restTemplate.getForObject(fooResourceUrl, Response.class);

        return new ReturnData(response.getResults().get(0).getGeometry().getLat(), response.getResults().get(0).getGeometry().getLng());
    }
}
