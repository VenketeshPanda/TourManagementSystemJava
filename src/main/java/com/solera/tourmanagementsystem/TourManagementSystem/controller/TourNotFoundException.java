package com.solera.tourmanagementsystem.TourManagementSystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TourNotFoundException extends  RuntimeException{


    public TourNotFoundException() {
    }

    public TourNotFoundException(String message) {
        super(message);
    }

}
