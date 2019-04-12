package com.noideateam.braincode_noideateam.generategeoindex;

import javax.validation.constraints.NotNull;

public class ZIPCode {
    @NotNull
    private String zipCode;

    public ZIPCode(String zipCode) {
        if(isValid()) {
            this.zipCode = zipCode;
        }
    }

    private boolean isValid(String zipCode) {
        boolean checkValid = false;

        checkValid = zipCode.matches("^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$");

        return checkValid;
    }

    public String getZipCode() {
        return zipCode;
    }
}
