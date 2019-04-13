package com.noideateam.braincode_noideateam.restreturn;

public class Location {
    private BetterLocation betterLocation;
    private OriginalLocation originalLocation;


    public Location(String name, double distance) {
        this.originalLocation = new OriginalLocation(name, distance);
    }

    public Location(String better_names, double better_distance, String original_name, double original_distance){
        this.originalLocation = new OriginalLocation(original_name, original_distance);
        this.betterLocation = new BetterLocation(better_names, better_distance, true);
    }

    public BetterLocation getBetterLocation() {
        return betterLocation;
    }

    public void setBetterLocation(BetterLocation betterLocation) {
        this.betterLocation = betterLocation;
    }

    public OriginalLocation getOriginalLocation() {
        return originalLocation;
    }

    public void setOriginalLocation(OriginalLocation originalLocation) {
        this.originalLocation = originalLocation;
    }
}