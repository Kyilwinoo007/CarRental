package com.carrental.CarRental.ResponseEntity;

public class RentException extends RuntimeException{
    public RentException(String message){
        super(message);
    }
}
