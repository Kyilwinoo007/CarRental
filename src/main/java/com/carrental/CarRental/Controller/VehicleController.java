package com.carrental.CarRental.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/vehicle")
public class VehicleController {

    @PostMapping("/create")
    void createVehicle(){
        //brandId (Toyota,Nissan)
        //modelId (Wish,Corolla,Note)
        //ModelYear
        //Color
        //Capacity (2 Seats,4 Seaters,5 Seaters,7 seaters,10,15 seaters)
        //PlateNumber
        //registerDate (register at system)
        //VehicleTypeId (Van,Sub,MVP,Sedan,MiniVan)
        //isActive (true,false)  //optional //logic


    }

    //VehicleType
    //id
    //Name (Van,Sub,MVP,Sedan,MiniVan)
    //createdAt
    //updatedAt


    //BrandTable
    //id
    //Name (Toyota,Nissan)
    //createdAt
    //updatedAt


    //Model
    //id
    //brandId
    //Model (Wish,Corolla,Note)
    //createdAt
    //updatedAt


    //create vehicle,rent,..
    //getVehicleList
}
