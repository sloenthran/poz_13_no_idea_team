package com.noideateam.braincode_noideateam;

import com.noideateam.braincode_noideateam.generategeoindex.GenerateGeoIndex;
import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.ReturnGenerateGeoIndex;
import com.noideateam.braincode_noideateam.restreturn.Location;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserReqestController {
    private final UserRepository userRepository;

    UserReqestController(UserRepository repository){
        this.userRepository = repository;
    }

    @GetMapping("/requestwithgeo")
    public UserRequestGeo userRequestGeo(
            @RequestParam(value = "login", defaultValue = "User") String login,
            @RequestParam(value = "geoLength", defaultValue = "0.0") float geoLength,
            @RequestParam(value = "geoWidth", defaultValue = "0.0") float geoWidth
    ){
        return new UserRequestGeo(login, geoLength, geoWidth);
    }

    @GetMapping("/all")
    List<User> all(){
        return userRepository.findAll();
    }

    @GetMapping("/request")
    Location getWithoutDatabase(
            @RequestParam("chosen_street") String chosen_street,
            @RequestParam("chosen_city") String chosen_city,
            @RequestParam("chosen_zip") String chosen_zip
    ) throws IOException {
        GenerateGeoIndex ggi = new GenerateGeoIndex(chosen_street, chosen_city, chosen_zip);
        ReturnGenerateGeoIndex tempUserChoice = ggi.generate();

        CollectionPoints collectionPoints = new CollectionPoints();
        Optional<Map.Entry<CollectionPoint, Double>> closestPoint = collectionPoints.getClosest(tempUserChoice.getX(), tempUserChoice.getY());

        return new Location(closestPoint.get().getKey().getName(), closestPoint.get().getValue());
    }

    @PostMapping("/request")
    User newUser(@RequestBody User newEmployee) {
        return userRepository.save(newEmployee);
    }

    @GetMapping("/request/{id}/")
    Location one(
            @PathVariable Long id,
            @RequestParam("chosen_street") String chosen_street,
            @RequestParam("chosen_city") String chosen_city,
            @RequestParam("chosen_zip") String chosen_zip
    ) throws IOException {
        User tempUser = new User(
          userRepository.findById(id).get().getLogin(),
          userRepository.findById(id).get().getStreet(),
          userRepository.findById(id).get().getCity(),
          userRepository.findById(id).get().getZip()
        );

        boolean suggest = false;
        System.out.println(tempUser.getId() + ", " +tempUser.getLogin() + ", " + tempUser.getStreet() + ", " + tempUser.getCity() + ", " + tempUser.getZip());

        GenerateGeoIndex ggi = new GenerateGeoIndex(tempUser.getStreet(), tempUser.getCity(), tempUser.getZip());
        ReturnGenerateGeoIndex tempUserGeo = ggi.generate();

        ggi = new GenerateGeoIndex(chosen_street, chosen_city, chosen_zip);
        ReturnGenerateGeoIndex tempUserChoice = ggi.generate();

        CollectionPoints collectionPoints = new CollectionPoints();

        double distanceToChosenPoint = collectionPoints.getDistance(tempUserGeo.getX(), tempUserGeo.getY(), tempUserChoice.getX(), tempUserChoice.getY());

        Optional<Map.Entry<CollectionPoint, Double>> closestPoint = collectionPoints.getClosest(tempUserGeo.getX(), tempUserGeo.getY());

        if (distanceToChosenPoint > closestPoint.get().getValue()){
            suggest = true;
            System.out.println("Suggest is true");
            return new Location(closestPoint.get().getKey().getName(), closestPoint.get().getValue(), chosen_street, distanceToChosenPoint);
        } else{
            return new Location(chosen_street, distanceToChosenPoint);
        }
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