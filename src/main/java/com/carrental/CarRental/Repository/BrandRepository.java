package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.BrandEntity;
import com.carrental.CarRental.Data.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity,Integer> {

    List<BrandEntity> findAll();

    List<BrandEntity> findBrandByBrandName(String brandName);
}
