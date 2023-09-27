package com.solera.tourmanagementsystem.TourManagementSystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TourExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<TourErrorResponse> handleException(TourNotFoundException tne){
        TourErrorResponse tourErrorResponse = new TourErrorResponse(HttpStatus.NOT_FOUND.value(),tne.getMessage(),System.currentTimeMillis());
        return new ResponseEntity<>(tourErrorResponse,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<TourErrorResponse> handleException(Exception tne){
        TourErrorResponse tourErrorResponse = new TourErrorResponse(HttpStatus.BAD_REQUEST.value(),tne.getMessage(),System.currentTimeMillis());
    return new ResponseEntity<>(tourErrorResponse,HttpStatus.NOT_FOUND);
    }
}
