package com.noideateam.braincode_noideateam;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserReqestController {


//    private String login = "random";
//    private String city = "Poznan";
//    private String street = "Rocha";
//    private String zip = "12-345";

    private final UserRepository userRepository;

    UserReqestController(UserRepository repository){
        this.userRepository = repository;
    }

    @GetMapping("/requestwithgeo")
    public UserRequestGeo userRequestGeo(@RequestParam(value = "login", defaultValue = "User") String login,
                                         @RequestParam(value = "geoLength", defaultValue = "0.0") float geoLength,
                                         @RequestParam(value = "geoWidth", defaultValue = "0.0") float geoWidth
    ) {

        return new UserRequestGeo(login, geoLength, geoWidth);
    }

//    @GetMapping("/request")
//    public UserRequestAdress userRequest(@RequestParam(value = "login", defaultValue = "User") String login,
//                                         @RequestParam(value = "street", defaultValue = "Grunwaldzka 182") String street,
//                                         @RequestParam(value = "city", defaultValue = "Poznan") String city,
//                                         @RequestParam(value = "zip", defaultValue = "60-166") String zip
//    ) {
//
//    //get geo codes
//    //then send them to geo index
//    //and send them back to user
//        return new UserRequestAdress(this.login, street, this.city, zip);
//    }
//
//    @PostMapping("/request")
//    public void AddUser(@RequestBody String login, @RequestBody String city){
//        this.login = login;
//        this.city = city;
//    }


    @GetMapping("/request")
    List<User> all(){
        return userRepository.findAll();
    }
    @PostMapping("/request")
    User newUser(@RequestBody User newEmployee) {
        return userRepository.save(newEmployee);
    }


    @GetMapping("/request/{id}")
    User one(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {

        return userRepository.findById(id)
                .map(user -> {
                    user.setLogin(newUser.getLogin());
                    user.setStreet(newUser.getStreet());
                    user.setCity(newUser.getCity());
                    user.setZip(newUser.getZip());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        userRepository.deleteById(id);
    }


}
