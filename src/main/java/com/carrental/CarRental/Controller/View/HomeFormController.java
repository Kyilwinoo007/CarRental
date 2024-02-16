package com.carrental.CarRental.Controller.View;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class HomeFormController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    //Owner Login/ Register
    //User Login / Register
    //Show All Vehicles
}
