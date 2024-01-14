package com.carrental.CarRental.Controller;


import com.carrental.CarRental.Data.Model.OwnerRegisterParam;
import com.carrental.CarRental.Data.Model.VehicleRegisterParam;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/vehicle")
public class VehicleController {

    @PostMapping("/create")
   // void createVehicle(){
        //brandId (Toyota,Nissan)
        //modelId (Wish,Corolla,Note)
        //ModelYear
        //Color
        //Capacity (2 Seats,4 Seaters,5 Seaters,7 seaters,10,15 seaters)
        //PlateNumber
        //registerDate (register at system)
        //VehicleTypeId (Van,Sub,MVP,Sedan,MiniVan)
        //isActive (true,false)  //optional //logic


   // }

    ResponseEntity<VehicleRegisterParam> registerOwner(@Valid @RequestBody VehicleRegisterParam param) {
        return new ResponseEntity<>(param, CREATED);
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
