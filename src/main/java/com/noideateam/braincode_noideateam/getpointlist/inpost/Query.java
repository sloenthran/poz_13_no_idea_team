package com.noideateam.braincode_noideateam.getpointlist.inpost;

import org.springframework.web.client.RestTemplate;

public class Query {

    public static ReturnPointList ask() {

        RestTemplate restTemplate = new RestTemplate();

        String fooResourceUrl = "https://api-shipx-pl.easypack24.net/v1/points?&per_page=10000&fields=location,address_details";
        Response response = restTemplate.getForObject(fooResourceUrl, Response.class);

        System.out.println(response);

        ReturnPointList pointList = new ReturnPointList();

        for(Items item : response.getItems()) {
            pointList.addPoint(
                    item.getLocation().getLatitude(),
                    item.getLocation().getLongtitude(),
                    item.getAdress().getStreet() + " " + item.getAdress().getHouseNumber(),
                    item.getAdress().getCity(),
                    item.getAdress().getPostCode()
            );
        }

        return pointList;

    }
}