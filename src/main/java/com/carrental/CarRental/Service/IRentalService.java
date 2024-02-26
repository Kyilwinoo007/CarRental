package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.RentalFee;
import com.carrental.CarRental.Data.Entity.RentalType;

import java.util.List;

public interface IRentalService {

    RentalType save(String description);

    List<RentalType> getAllRentalType();

    RentalFee saveRentalFee(Double perHr, Double perDay);

    RentalFee getRentalFeeById(int id);
}
