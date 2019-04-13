package com.noideateam.braincode_noideateam;


import com.noideateam.braincode_noideateam.generategeoindex.CollectionPoints;
import com.noideateam.braincode_noideateam.generategeoindex.GenerateGeoIndex;
import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.ReturnGenerateGeoIndex;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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


//    @GetMapping("/request/{id}")
//    User one(@PathVariable Long id){
//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException(id));
//    }

    @GetMapping("/request/{id}")
    Location one(@PathVariable Long id) throws IOException {

        User tempUser = new User(
          userRepository.findById(id).get().getLogin(),
          userRepository.findById(id).get().getStreet(),
          userRepository.findById(id).get().getCity(),
          userRepository.findById(id).get().getZip()
        );

        System.out.println(tempUser.getId() + ", " +tempUser.getLogin() + ", " + tempUser.getStreet() + ", " + tempUser.getCity() + ", " + tempUser.getZip());

        GenerateGeoIndex ggi = new GenerateGeoIndex(tempUser.getStreet(), tempUser.getCity(), tempUser.getZip());
        ReturnGenerateGeoIndex tempUserGeo = ggi.generate();

        System.out.println(tempUserGeo.getX() + "\t" + tempUserGeo.getY());

        CollectionPoints collectionPoints = new CollectionPoints();


//        Map<CollectionPoint, Double> result= CollectionPoints.collectionPointsInRange(tempUserGeo.getX(), tempUserGeo.getY(), 10);
//        result.forEach((key,value) -> {
//            System.out.println("key = " + key.getName() + " " + value);
//        });
        Optional<Map.Entry<CollectionPoint, Double>> closestPoint = collectionPoints.getClosest(tempUserGeo.getX(), tempUserGeo.getY());

        System.out.println("Finish");

//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException(id));
        Location toSend = new Location(closestPoint.get().getKey().getName(), closestPoint.get().getValue());

        return toSend;

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
