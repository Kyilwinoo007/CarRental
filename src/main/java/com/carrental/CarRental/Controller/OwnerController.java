package com.carrental.CarRental.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/owner")
public class OwnerController {
    @PostMapping("/register")
    void registerOwner(){
        //FirstName
        //LastName
        //Email (required)
        //Phone (optional)
        //Password (Hash)

        //createVehicle
        //Dob
        //HomeNo.
        //Township
        //City
        //Country
        //ICNo.
        //CreatedAt
        //UpdatedAt
    }
    @PostMapping("/login")
    void loginOwner(){

    }
}
