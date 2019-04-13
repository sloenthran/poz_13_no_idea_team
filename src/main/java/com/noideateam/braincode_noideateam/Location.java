package com.noideateam.braincode_noideateam;

import javax.persistence.Entity;

//@Entity
public class Location {
    private String better_name = null;
    private double better_distance = -1;

    boolean suggest = false;
    private String original_name;
    private double original_distance;


    public Location(String name, double closest) {
        this.original_name = name;
        this.original_distance = closest;

    }

    public Location(String better_name, double better_distance, String original_name, double original_distance){
        this.better_name=better_name;
        this.better_distance=better_distance;
        this.original_name=original_name;
        this.original_distance=original_distance;
        this.suggest=true;
    }


    public String getBetter_name() {
        return better_name;
    }

    public double getBetter_distance() {
        return better_distance;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public double getOriginal_distance() {
        return original_distance;
    }
    public boolean getSuggest(){
        return this.suggest;
    }
}
