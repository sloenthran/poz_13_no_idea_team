package com.noideateam.braincode_noideateam;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserReqestController {
    public static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/request")
    public UserRequest userRequest(@RequestParam(value="login", defaultValue="User") String login,
                                   @RequestParam(value="geoLength", defaultValue="0.0") float geoLength,
                                   @RequestParam(value="geoWidth", defaultValue="0.0") float geoWidth
                                   ){
        return new UserRequest(login, geoLength, geoWidth);
    }
}
