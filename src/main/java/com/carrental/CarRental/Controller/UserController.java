package com.carrental.CarRental.Controller;

import com.carrental.CarRental.Data.Model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/user")
public class UserController {

    // User register,Login,Crud
    @PostMapping("/register")
    void registerUser(@RequestBody User user){
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

    }
    @PostMapping("/login")
    void loginUser(@RequestBody User user){
        //email
        //password
    }
    //update
}
