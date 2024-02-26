package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.RentalFee;
import com.carrental.CarRental.Data.Entity.RentalType;
import com.carrental.CarRental.Repository.RentalFeeRepository;
import com.carrental.CarRental.Repository.RentalTypeRepository;
import com.carrental.CarRental.ResponseEntity.RentException;
import com.carrental.CarRental.ResponseEntity.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService implements IRentalService{

    @Autowired
    RentalTypeRepository rentalTypeRepository;

    @Autowired
    RentalFeeRepository rentalFeeRepository;


    @Override
    public RentalType save(String description) {
        var rentalTypes = rentalTypeRepository.findRentalTypeByDescription(description);
        if (!rentalTypes.isEmpty()){
           throw new RentException("Rental Type Already Exist!");

        }
        var rentalType = new RentalType();
        rentalType.setDescription(description);
        rentalType.setCreatedAt(System.currentTimeMillis());
        rentalType.setUpdatedAt(System.currentTimeMillis());
        return rentalTypeRepository.save(rentalType);
    }

    @Override
    public List<RentalType> getAllRentalType() {
        return rentalTypeRepository.findAll();
    }

    @Override
    public RentalFee saveRentalFee(Double perHr, Double perDay) {
        var rentalFee = new RentalFee();
        rentalFee.setFeePerDay(perDay);
        rentalFee.setFeePerHr(perHr);
        rentalFee.setCreatedAt(System.currentTimeMillis());
        rentalFee.setUpdatedAt(System.currentTimeMillis());
        return rentalFeeRepository.save(rentalFee);
    }

    @Override
    public RentalFee getRentalFeeById(int id) {
        return rentalFeeRepository.findRentalFeeById(id);
    }
}
