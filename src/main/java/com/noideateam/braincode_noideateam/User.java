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



    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setId(Long id){
        this.id = id;
    }
}
