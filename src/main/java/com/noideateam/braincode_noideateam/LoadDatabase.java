package com.noideateam.braincode_noideateam;


//import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository){
        return args -> {
            System.out.println("preloading " + repository.save(new User("Bilbo Baggins", "Szczepankowo 80", "Poznań", "61-310")));
            System.out.println("preloading " + repository.save(new User("Frodo Baggins", "Bukowa 8", "Poznań", "61-440")));

        };
    }
}
