package com.noideateam.braincode_noideateam;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(long id) {
        super("Could not find employee " + id);
    }
}