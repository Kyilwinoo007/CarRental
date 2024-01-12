package com.carrental.CarRental.Controller;

import com.carrental.CarRental.Data.Model.UserRegisterParam;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    // User register,Login,Crud
    //status 500
    //{
    //code: 401
    //message:"Invalid First Name"
    //}


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
    void loginUser(@RequestParam(value = "email")String email,@RequestParam(value = "password")String password){
        //email
        //password
    }
    //update
}
