package com.carrental.CarRental.Controller.Rest;


import com.carrental.CarRental.Data.Entity.RentalFee;
import com.carrental.CarRental.Data.Entity.RentalType;
import com.carrental.CarRental.Data.Entity.VehicleEntity;
import com.carrental.CarRental.Data.Model.Response;
import com.carrental.CarRental.Data.Model.VehicleRegisterParam;
import com.carrental.CarRental.ResponseEntity.ParamException;
import com.carrental.CarRental.Service.IRentalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/rent")
public class RentalController {

    @Autowired
    IRentalService rentalService;

    @PostMapping("/rentalType")
    ResponseEntity<Response<RentalType>> createRentalType(@RequestParam(value = "description") String description) {
        if (description.isEmpty()) {
            throw new ParamException("Description is required");
        }
        RentalType entity = rentalService.save(description);
        Response<RentalType> response = new Response<>();
        response.setCode(CREATED.value());
        response.setMessage("Success");
        response.setResult(entity);
        return new ResponseEntity<>(response, CREATED);
    }

    @GetMapping("/rentalType")
    ResponseEntity<Response<List<RentalType>>> getAllRentalType() {

        List<RentalType> rentalTypes = rentalService.getAllRentalType();
        Response<List<RentalType>> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(rentalTypes);
        return new ResponseEntity<>(response, OK);
    }

    @PostMapping("/fee")
    ResponseEntity<Response<RentalFee>> createRentalFee(@RequestParam(value = "per_hr") Optional<Double> per_hr,
                                                        @RequestParam(value = "per_day") Optional<Double> per_day) {
        double perDay = per_day.orElse(0.0);
        double perHr = per_hr.orElse(0.0);
        if (perDay <= 0.0 && perHr <= 0.0) {
            throw new ParamException("Fee is required");
        }
        RentalFee entity = rentalService.saveRentalFee(perHr,perDay);
        Response<RentalFee> response = new Response<>();
        response.setCode(CREATED.value());
        response.setMessage("Success");
        response.setResult(entity);
        return new ResponseEntity<>(response, CREATED);
    }
    @GetMapping("/fee")
    ResponseEntity<Response<RentalFee>> getRentalFeeById(@RequestParam(value = "id")int id){
        RentalFee rentalFee = rentalService.getRentalFeeById(id);
        Response<RentalFee> response = new Response<>();
        response.setCode(OK.value());
        response.setMessage("Success");
        response.setResult(rentalFee);
        return new ResponseEntity<>(response, OK);
    }



}
