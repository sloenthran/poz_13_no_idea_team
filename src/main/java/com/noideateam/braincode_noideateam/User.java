package com.noideateam.braincode_noideateam;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String login;
    private String street;
    private String city;
    private String zip;


    public User(String login, String street, String city, String zip) {
        this.login = login;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public User(){}

    public String getLogin() {
        return login;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}
