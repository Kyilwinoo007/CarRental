package com.carrental.CarRental.Controller;

import com.carrental.CarRental.Data.Model.UserRegisterParam;
import com.carrental.CarRental.ResponseEntity.OwnerCustomException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carrental.CarRental.Data.Model.OwnerRegisterParam;
import com.carrental.CarRental.ResponseEntity.UserCustomException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("/v1/owner")
public class OwnerController {
    @PostMapping("/register")
    ResponseEntity<OwnerRegisterParam> registerOwner(@Valid @RequestBody OwnerRegisterParam param) {
        //First Name
        //Last Name
        //email required
        //phone optional
        //password

        //createVehicle
        //Dob
        //HomeNo.
        //Township
        //City
        //Country
        //ICNo.
        //CreatedAt
        //UpdatedAt
        return new ResponseEntity<>(param, CREATED);
    }

    @PostMapping("/login")
    void loginOwner(@RequestParam(value = "email")
                    String email,
                    @RequestParam(value = "password")
                    String password) {
        if (email.isEmpty()) {
            throw new OwnerCustomException("Email is required");
        }
        if (password.isEmpty()) {
            throw new OwnerCustomException("Password is required");
        }
    }
}
