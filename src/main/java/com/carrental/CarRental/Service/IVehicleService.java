package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.BrandEntity;
import com.carrental.CarRental.Data.Entity.ModelEntity;
import com.carrental.CarRental.Data.Entity.VehicleEntity;
import com.carrental.CarRental.Data.Entity.VehicleTypeEntity;
import com.carrental.CarRental.Data.Model.VehicleRegisterParam;

import java.util.List;


public interface IVehicleService {
    VehicleEntity save(VehicleRegisterParam param);

    List<VehicleEntity> getAllVehicle();

    BrandEntity createBrand(String brandName);

    List<BrandEntity> getAllBrand();

    List<BrandEntity> getBrandByName(String brandName);

    ModelEntity createModel(int brandId, String modelName);

    List<ModelEntity> getModelByName(String modelName);


    List<ModelEntity> getAllModel();

    List<ModelEntity> getModelByNameAndBrandId(int brandId, String modelName);

    List<ModelEntity> getModelByBrandId(int brandId);

    VehicleTypeEntity createVehicleType(String vehicleTypeName);

    List<VehicleTypeEntity> getVehicleByName(String vehicleTypeName);

    List<VehicleTypeEntity> getAllVehicleType();
}
