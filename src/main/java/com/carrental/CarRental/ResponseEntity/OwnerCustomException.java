package com.carrental.CarRental.ResponseEntity;

public class OwnerCustomException extends RuntimeException{
    public OwnerCustomException(String message){
        super(message);
    }
}