package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Integer> {


}

//UI(html) <-> controller
//js <-> restController <-> Service <-> repository(data access layer)