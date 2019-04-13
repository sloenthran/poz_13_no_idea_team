package com.noideateam.braincode_noideateam;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
