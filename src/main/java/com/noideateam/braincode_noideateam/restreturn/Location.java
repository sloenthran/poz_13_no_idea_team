package com.noideateam.braincode_noideateam.restreturn;

public class Location {
    private BetterLocation betterLocation;
    private OriginalLocation originalLocation;
    private String shopType;
    private String deliveryHours;

    public Location(double distance, String original_street, String original_city, String original_zip, String shopType, String deliveryHours)
    {
        this.shopType = shopType;
        this.deliveryHours = deliveryHours;

        this.originalLocation = new OriginalLocation(
                distance,
                original_street,
                original_city,
                original_zip
        );
    }

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
        this.shopType = shopType;
        this.deliveryHours = deliveryHours;
        this.originalLocation = new OriginalLocation(original_distance, original_street, original_city, original_zip);
        this.betterLocation = new BetterLocation(better_names, better_distance, true, better_street, better_city, better_zip, better_notes);
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

    public String getShopType() {
        String returnType;

        switch(shopType) {
            case "UPS": returnType = "UPS"; break;
            case "POCZTA_POLSKA_ZABKA": returnType = "ZABKA"; break;
            case "RUCH": returnType = "RUCH"; break;
            case "POCZTA_POLSKA_ORLEN": returnType = "ORLEN"; break;
            case "POCZTA_POLSKA": returnType = "POCZTA_POLSKA"; break;
            case "PACZKOMAT": returnType = "PACZKOMAT"; break;
            default: returnType = "null"; break;
        }

        return returnType;
    }

    public String getDeliveryHours() {
        return this.deliveryHours;
    }
}