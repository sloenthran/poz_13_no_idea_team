package com.noideateam.braincode_noideateam.restreturn;

public class Location {
    private BetterLocation betterLocation;
    private OriginalLocation originalLocation;


    public Location(double distance, String original_street, String original_city, String original_zip) {
        this.originalLocation = new OriginalLocation(
//                name,
                distance,
                original_street,
                original_city,
                original_zip);
    }

    public Location(String better_names,
                    double better_distance,
//                    String original_name,
                    double original_distance,
                    String original_street,
                    String original_city,
                    String original_zip,
                    String better_street,
                    String better_city,
                    String better_zip

                    ){
        this.originalLocation = new OriginalLocation(original_distance, original_street, original_city, original_zip);


        this.betterLocation = new BetterLocation(better_names, better_distance, true, better_street, better_city, better_zip);
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