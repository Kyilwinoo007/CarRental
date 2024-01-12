package com.carrental.CarRental.Controller;

import com.carrental.CarRental.Data.Model.UserRegisterParam;
import com.carrental.CarRental.ResponseEntity.UserCustomException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/user")
public class UserController {



    //Todo response with exception in validation
    @PostMapping("/register")
   ResponseEntity<UserRegisterParam> registerUser(@Valid @RequestBody UserRegisterParam param){
        //First Name
        //Last Name
        //email required
        //phone optional
        //password

        //book ->
        //dob
        //Houses No.
        //TownShip
        //City
        //Country
        //IC

        //validate userInput
        //save to db
        //return success or not
        return new ResponseEntity<>(param,CREATED);

    }


    @PostMapping("/login")
    void loginUser(@RequestParam(value = "email")
                   String email,
                   @RequestParam(value = "password")
                   String password){
        if (email.isEmpty()){
            throw new UserCustomException("Email is required");
        }
        if (password.isEmpty()){
            throw new UserCustomException("Password is required");
        }
        //email
        //password
    }
    //update
}
