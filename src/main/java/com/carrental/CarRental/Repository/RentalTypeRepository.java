package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.RentalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalTypeRepository extends JpaRepository<RentalType,Integer> {

    List<RentalType> findRentalTypeByDescription(String description);

}
