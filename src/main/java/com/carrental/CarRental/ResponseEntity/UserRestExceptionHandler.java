package com.carrental.CarRental.ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(UserCustomException exception){
        ExceptionResponse response = new ExceptionResponse();
        response.timestamp = System.currentTimeMillis();
        response.message = exception.getMessage();
        response.status = HttpStatus.NOT_FOUND.value();
        return  new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
