package com.carrental.CarRental.Controller.Rest;


import com.carrental.CarRental.Data.Model.Brand;
import com.carrental.CarRental.Data.Model.OwnerRegisterParam;
import com.carrental.CarRental.Data.Model.VehicleRegisterParam;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/vehicle")
public class VehicleController {

    @PostMapping("/create")
    ResponseEntity<VehicleRegisterParam> vehicleRegister(@Valid @RequestBody VehicleRegisterParam param) {
        //brandId (Toyota,Nissan)
        //modelId (Wish,Corolla,Note)
        //ModelYear
        //Color
        //Capacity (2 Seats,4 Seaters,5 Seaters,7 seaters,10,15 seaters)
        //PlateNumber
        //registerDate (register at system)
        //VehicleTypeId (Van,Sub,MVP,Sedan,MiniVan)
        //isActive (true,false)  //optional //logic
        return new ResponseEntity<>(param, CREATED);
    }

    @GetMapping("/getAllBrand")
    ResponseEntity<List<Brand>> getAllVehicleBrand(){
        List<Brand> tempBrand = new ArrayList<>();
        //get all brand from db
        tempBrand.add(new Brand(0,"Toyota",System.currentTimeMillis(),System.currentTimeMillis()));
        tempBrand.add(new Brand(1,"Nissan",System.currentTimeMillis(),System.currentTimeMillis()));
        return new ResponseEntity<List<Brand>>(tempBrand, HttpStatus.OK);
    }


    //todo
    void getAllVehicleType(){

    }

    void getAllModel(){

    }
    //VehicleType
    //id
    //Name (Van,Sub,MVP,Sedan,MiniVan)
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
