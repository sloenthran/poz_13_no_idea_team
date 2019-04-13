package com.noideateam.braincode_noideateam;

//import lombok.Data;


public class UserRequestAdress {

    private String login;
    private String street;
    private String city;
    private String zip;


    public UserRequestAdress(String login, String street, String city, String zip) {
        this.login = login;
        this.street = street;
        this.city = city;
        this.zip = zip;


    }

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
