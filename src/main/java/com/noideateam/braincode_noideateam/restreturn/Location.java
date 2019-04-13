package com.noideateam.braincode_noideateam.restreturn;

public class Location {
    private BetterLocation betterLocation;
    private OriginalLocation originalLocation;
//    private String shopType;
//    private String deliveryHours;



    //constructor for data without database
    public Location(double distance, String original_street, String original_city, String original_zip, String shopType, String deliveryHours)
    {

        this.originalLocation = new OriginalLocation(
                distance,
                original_street,
                original_city,
                original_zip
        );
    }

    //constructor for suggesting with adress inside database
    public Location(
            String better_names,
            double better_distance,
            double original_distance,
            String original_street,
            String original_city,
            String original_zip,
            String better_street,
            String better_city,
            String better_zip,
            String better_notes,
            String shopType,
            String deliveryHours
    ){
        this.originalLocation = new OriginalLocation(original_distance, original_street, original_city, original_zip);
        this.betterLocation = new BetterLocation(better_names, better_distance, true, better_street, better_city, better_zip, better_notes, shopType, deliveryHours);
    }

//    constructor for only request
    public Location(
            String pointName, double distance, boolean suggest, String better_street,
            String better_city, String better_zip, String notes, String shopType, String deliveryHours
    ){
        this.betterLocation = new BetterLocation(pointName, distance, true, better_street, better_city, better_zip, notes, shopType, deliveryHours);
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