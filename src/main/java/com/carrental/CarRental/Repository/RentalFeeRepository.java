package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.RentalFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalFeeRepository extends JpaRepository<RentalFee,Integer> {
    RentalFee findRentalFeeById(int id);
}
