package com.carrental.CarRental.Controller.View;


import com.carrental.CarRental.Data.Entity.ModelEntity;
import com.carrental.CarRental.Service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/v1/vehicle")
public class VehicleFormController {


    @GetMapping("/create_vehicle")
    public String createVehicle(Model model) {

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
