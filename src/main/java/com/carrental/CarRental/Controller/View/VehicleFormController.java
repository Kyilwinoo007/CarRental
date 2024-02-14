package com.carrental.CarRental.Controller.View;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/vehicle")
public class VehicleFormController {


    @GetMapping("/create_vehicle")
    public String loginUser() {
        return "create_vehicle";
    }
    //owner
    //Show All  vehicles by owner
    //create vehicle
    //update vehicle info

    // user
    //Show All available vehicles
    //rent vehicle

}
