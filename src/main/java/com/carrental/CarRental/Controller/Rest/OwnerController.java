package com.carrental.CarRental.Controller.Rest;

import com.carrental.CarRental.Data.Entity.OwnerEntity;
import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.*;
import com.carrental.CarRental.ResponseEntity.OwnerCustomException;
import com.carrental.CarRental.ResponseEntity.UserNotFoundException;
import com.carrental.CarRental.Service.IOwnerService;
import com.carrental.CarRental.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carrental.CarRental.ResponseEntity.UserCustomException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("/v1/owner")
public class OwnerController {

    @Autowired
    private IOwnerService ownerService;

    @PostMapping("/register")
    ResponseEntity<Response<OwnerEntity>> registerOwner(@Valid @RequestBody OwnerRegisterParam param) {
        OwnerEntity entity = ownerService.saveOwner(param);
        Response<OwnerEntity> response = new Response<>();
        response.setCode(CREATED.value());
        response.setMessage("Success");
        response.setResult(entity);
        return new ResponseEntity<>(response, CREATED);
    }


    @PostMapping("/login")
    ResponseEntity<Response<List<OwnerEntity>>> loginOwner(@RequestParam(value = "email") String email,
                                                         @RequestParam(value = "password") String password) {
        if (email.isEmpty()) {
            throw new OwnerCustomException("Email is required");
        }
        if (password.isEmpty()) {
            throw new OwnerCustomException("Password is required");
        }

        List<OwnerEntity> ownerList = ownerService.getOwnerByEmailAndPassword(email, password);
        Response<List<OwnerEntity>> response = new Response<>();
        if (ownerList.isEmpty()) {
            throw new UserNotFoundException("Owner Not Found");
        } else {
            response.setCode(HttpStatus.OK.value());
            response.setMessage("Success");
            response.setResult(ownerList);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/update_owner_info")
    ResponseEntity<Response<OwnerEntity>> updateOwnerInformation(@RequestParam(value = "id") int id,
                                                                 @RequestBody OwnerInfoParam ownerInfoParam) {
        if (id < 0) {
            throw new OwnerCustomException("Please enter valid id!");
        }
        OwnerEntity ownerEntity =  ownerService.updateOwnerInfo(id,ownerInfoParam);
        Response<OwnerEntity> response = new Response<>();
        response.setCode(HttpStatus.OK.value());
        response.setMessage("Success");
        response.setResult(ownerEntity);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}
