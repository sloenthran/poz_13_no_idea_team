package com.noideateam.braincode_noideateam.generategeoindex;

import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.Response;
import org.springframework.web.client.RestTemplate;

public class HTTPConnection {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://api.opencagedata.com/geocode/v1/json?q=Grunwaldzka+182+Poznań+60-309&key=ee5278cc22494f74b5ecbd782c2e4661&pretty=1";
        Response response
                = restTemplate.getForObject(fooResourceUrl, Response.class);

        System.out.println(response.getResults().get(0));
    }

}