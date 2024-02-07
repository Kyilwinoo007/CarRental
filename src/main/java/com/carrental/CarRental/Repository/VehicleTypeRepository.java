package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.VehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity,Integer> {
    List<VehicleTypeEntity> findVehicleTypeByVehicleTypeName(String vehicleTypeName);
}
