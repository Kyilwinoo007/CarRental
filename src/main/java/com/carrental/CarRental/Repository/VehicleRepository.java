package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Entity.VehicleEntity;
import com.carrental.CarRental.Data.Entity.VehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Integer> {

    List<VehicleEntity> findAll();

}

//UI(html) <-> controller
//js <-> restController <-> Service <-> repository(data access layer)