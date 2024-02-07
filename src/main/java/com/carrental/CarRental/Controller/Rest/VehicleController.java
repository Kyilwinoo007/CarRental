package com.carrental.CarRental.Controller.Rest;


import com.carrental.CarRental.Data.Entity.*;
import com.carrental.CarRental.Data.Model.Brand;
import com.carrental.CarRental.Data.Model.OwnerRegisterParam;
import com.carrental.CarRental.Data.Model.Response;
import com.carrental.CarRental.Data.Model.VehicleRegisterParam;
import com.carrental.CarRental.ResponseEntity.ParamException;
import com.carrental.CarRental.ResponseEntity.UserCustomException;
import com.carrental.CarRental.Service.IVehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/vehicle")
public class VehicleController {

    @Autowired
    IVehicleService vehicleService;
//
//    @PostMapping("/create")
//    ResponseEntity<VehicleRegisterParam> vehicleRegister(@Valid @RequestBody VehicleRegisterParam param) {
//        //brandId (Toyota,Nissan)
//        //modelId (Wish,Corolla,Note)
//        //ModelYear
//        //Color
//        //Capacity (2 Seats,4 Seaters,5 Seaters,7 seaters,10,15 seaters)
//        //PlateNumber
//        //registerDate (register at system)
//        //VehicleTypeId (Van,Sub,MVP,Sedan,MiniVan)
//        //isActive (true,false)  //optional //logic
//        return new ResponseEntity<>(param, CREATED);
//    }
//
//    @GetMapping("/getAllBrand")
//    ResponseEntity<List<Brand>> getAllVehicleBrand(){
//        List<Brand> tempBrand = new ArrayList<>();
//        //get all brand from db
//        tempBrand.add(new Brand(0,"Toyota",System.currentTimeMillis(),System.currentTimeMillis()));
//        tempBrand.add(new Brand(1,"Nissan",System.currentTimeMillis(),System.currentTimeMillis()));
//        return new ResponseEntity<List<Brand>>(tempBrand, HttpStatus.OK);
//    }
//
//
//    //todo
//    void getAllVehicleType(){
//
//    }
//
//    void getAllModel(){
//
//    }
//    //VehicleType
//    //id
//    //Name (Van,Sub,MVP,Sedan,MiniVan)
//    //createdAt
//    //updatedAt
//
//
//    //Model
//    //id
//    //brandId
//    //Model (Wish,Corolla,Note)
//    //createdAt
//    //updatedAt
//
//
//    //create vehicle,rent,..
//    //getVehicleList

    @PostMapping("/vehicle")
    ResponseEntity<Response<VehicleEntity>> createVehicle(@Valid @RequestBody VehicleRegisterParam param) {
        VehicleEntity entity = vehicleService.save(param);
        Response<VehicleEntity> response = new Response<>();
        response.setCode(CREATED.value());
        response.setMessage("Success");
        response.setResult(entity);
        return new ResponseEntity<>(response, CREATED);
    }

    @GetMapping("/vehicles")
    ResponseEntity<Response<List<VehicleEntity>>> getAllVehicle() {
        List<VehicleEntity> lst = vehicleService.getAllVehicle();
        Response<List<VehicleEntity>> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(lst);
        return new ResponseEntity<>(response, OK);
    }

    @PostMapping("/brand")
    ResponseEntity<Response<BrandEntity>> createBrand(@RequestParam(value = "brandName") String brandName) {
        if (brandName.isEmpty()) {
            throw new ParamException("Brand Name is required");
        }
        List<BrandEntity> lst = vehicleService.getBrandByName(brandName);
        Response<BrandEntity> response = new Response<>();
        if (lst.isEmpty()) {
            var brandEntity = vehicleService.createBrand(brandName);
            response.setCode(HttpStatus.CREATED.value());
            response.setMessage("Success");
            response.setResult(brandEntity);
            return new ResponseEntity<>(response, CREATED);
        } else {
            var brandEntity = lst.get(0);
            response.setCode(OK.value());
            response.setMessage("Brand Already Exist!");
            response.setResult(brandEntity);
            return new ResponseEntity<>(response, OK);
        }

    }

    @GetMapping("/brands")
    ResponseEntity<Response<List<BrandEntity>>> getAllBrand() {
        List<BrandEntity> lst = vehicleService.getAllBrand();
        Response<List<BrandEntity>> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(lst);
        return new ResponseEntity<>(response, OK);
    }

    @PostMapping("/model")
    ResponseEntity<Response<ModelEntity>> createModel(@RequestParam(value = "modelName") String modelName,
                                                      @RequestParam(value = "brandId") int brandId) {
        if (modelName.isEmpty()) {
            throw new ParamException("Model Name is required");
        }
        if (brandId < 0) {
            throw new ParamException("Brand Id is required");
        }
        List<ModelEntity> lst = vehicleService.getModelByNameAndBrandId(brandId, modelName);
        Response<ModelEntity> response = new Response<>();
        if (lst.isEmpty()) {
            var modelEntity = vehicleService.createModel(brandId, modelName);
            response.setCode(HttpStatus.CREATED.value());
            response.setMessage("Success");
            response.setResult(modelEntity);
            return new ResponseEntity<>(response, CREATED);
        } else {
            var modelEntity = lst.get(0);
            response.setCode(OK.value());
            response.setMessage("Model Already Exist!");
            response.setResult(modelEntity);
            return new ResponseEntity<>(response, OK);
        }

    }

    @GetMapping("/models")
    ResponseEntity<Response<List<ModelEntity>>> getAllModel() {
        List<ModelEntity> lst = vehicleService.getAllModel();
        Response<List<ModelEntity>> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(lst);
        return new ResponseEntity<>(response, OK);
    }

    @GetMapping("/model/brandId")
    ResponseEntity<Response<List<ModelEntity>>> getModelByBrandId(@RequestParam(value = "brandId") int brandId) {
        List<ModelEntity> lst = vehicleService.getModelByBrandId(brandId);
        Response<List<ModelEntity>> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(lst);
        return new ResponseEntity<>(response, OK);

    }

    @PostMapping("/vehicleType")
    ResponseEntity<Response<VehicleTypeEntity>> createVehicleType(@RequestParam(value = "vehicleTypeName") String vehicleTypeName) {
        if (vehicleTypeName.isEmpty()) {
            throw new ParamException("Vehicle Type Name is required");
        }
        List<VehicleTypeEntity> lst = vehicleService.getVehicleByName(vehicleTypeName);
        Response<VehicleTypeEntity> response = new Response<>();
        if (lst.isEmpty()) {
            var vehicleTypeEntity = vehicleService.createVehicleType(vehicleTypeName);
            response.setCode(HttpStatus.CREATED.value());
            response.setMessage("Success");
            response.setResult(vehicleTypeEntity);
            return new ResponseEntity<>(response, CREATED);
        } else {
            var vehicleTypeEntity = lst.get(0);
            response.setCode(OK.value());
            response.setMessage("Vehicle Type Already Exist!");
            response.setResult(vehicleTypeEntity);
            return new ResponseEntity<>(response, OK);
        }

    }
    @GetMapping("/vehicleTypes")
    ResponseEntity<Response<List<VehicleTypeEntity>>> getAllVehicleTypes() {
        List<VehicleTypeEntity> lst = vehicleService.getAllVehicleType();
        Response<List<VehicleTypeEntity>> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(lst);
        return new ResponseEntity<>(response, OK);
    }
}

/// server   -> "add vehicle"
/// local    -> commit -m "add vehicle" -> push
/// local1   -> commit -m "add vehicle controller"  -> pull -> "add vehicle"
///                      -> vehicleController line 30,column 20
///                      -> vehicleController line 120,column 50
/// #<<--- head --->
/// addVehicle()
/// #<--- end ---->
