package com.noideateam.braincode_noideateam;

public class Location {
    private String better_name;
    private double better_distance;
    private String original_name;
    private double original_distance;

    public Location(String name, double closest) {
        this.better_name = name;
        this.better_distance = closest;
    }

    public String getBetter_name() {
        return better_name;
    }

    public double getBetter_distance() {
        return better_distance;
    }
}