package com.carrental.CarRental.ResponseEntity;

import java.util.Date;

public class ExceptionResponse {
    int status;
    Long timestamp;
    String message;



    public ExceptionResponse(int status, Long timestamp, String message) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ExceptionResponse(Long timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }


    public ExceptionResponse() {

    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
