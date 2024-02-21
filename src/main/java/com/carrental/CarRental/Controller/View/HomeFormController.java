package com.carrental.CarRental.Controller.View;


import com.carrental.CarRental.Service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class HomeFormController {
    @Autowired
    IVehicleService vehicleService;
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("vehicles",vehicleService.getAllVehicle());
        return "home";
    }
    //Owner Login/ Register
    //User Login / Register
    //Show All Vehicles
}
