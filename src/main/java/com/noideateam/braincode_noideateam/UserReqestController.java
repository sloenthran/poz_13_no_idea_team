package com.noideateam.braincode_noideateam;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserReqestController {
    public static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/requestwithgeo")
    public UserRequestGeo userRequestGeo(@RequestParam(value="login", defaultValue="User") String login,
                                      @RequestParam(value="geoLength", defaultValue="0.0") float geoLength,
                                      @RequestParam(value="geoWidth", defaultValue="0.0") float geoWidth
                                   ){

//        TODO: I guess here comes the rest?
        return new UserRequestGeo(login, geoLength, geoWidth);
    }

    @RequestMapping("/request")
    public UserRequestAdress userRequest(@RequestParam(value="login", defaultValue="User") String login,
                                      @RequestParam(value="street", defaultValue="Grunwaldzka 182") String street,
                                      @RequestParam(value="city", defaultValue="Poznan") String city,
                                      @RequestParam(value="zip", defaultValue="60-166") String zip
    ){

//        TODO: I guess here comes the rest?
        return new UserRequestAdress(login, street, city, zip);
    }
}
