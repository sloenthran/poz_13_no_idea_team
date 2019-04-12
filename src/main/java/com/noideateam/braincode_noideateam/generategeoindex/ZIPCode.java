package com.noideateam.braincode_noideateam.generategeoindex;

public class ZIPCode {
    private String zipCode;

    public ZIPCode(String zipCode) {
        if(isValid(zipCode)) {
            this.zipCode = zipCode;
        } else {
            this.zipCode = "bad_zipCode";
        }
    }

    private boolean isValid(String zipCode) {
        boolean checkValid = false;

        checkValid = zipCode.matches("[0-9]{2}-[0-9]{3}");

        return checkValid;
    }

    public String getZipCode() {
        return zipCode;
    }
}
