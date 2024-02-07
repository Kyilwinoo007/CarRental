package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.BrandEntity;
import com.carrental.CarRental.Data.Entity.ModelEntity;
import com.carrental.CarRental.Data.Entity.VehicleEntity;
import com.carrental.CarRental.Data.Entity.VehicleTypeEntity;
import com.carrental.CarRental.Data.Model.VehicleRegisterParam;
import com.carrental.CarRental.Repository.BrandRepository;
import com.carrental.CarRental.Repository.ModelRepository;
import com.carrental.CarRental.Repository.VehicleRepository;
import com.carrental.CarRental.Repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements  IVehicleService{

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    BrandRepository brandRepository;

    @Autowired
    ModelRepository modelRepository;

    @Autowired
    VehicleTypeRepository vehicleTypeRepository;
    @Override
    public VehicleEntity save(VehicleRegisterParam param) {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(param.getBrand().getId());
        brandEntity.setBrandName(param.getBrand().getName());


        ModelEntity modelEntity = new ModelEntity();
        modelEntity.setId(param.getModel().getId());
        modelEntity.setBrandId(param.getBrand().getId());
        modelEntity.setModelName(param.getModel().getName());


        VehicleTypeEntity vehicleTypeEntity = new VehicleTypeEntity();
        vehicleTypeEntity.setId(param.getVehicleType().getId());
        vehicleTypeEntity.setVehicleTypeName(param.getVehicleType().getName());


        VehicleEntity entity = new VehicleEntity(
                param.getBrand().getName(),
                param.getBrand().getId(),
                param.getModel().getName(),
                param.getModel().getId(),
                param.getModelYear(),
                param.getColor(),
                param.getCapacity(),
                param.getPlateNumber(),
                System.currentTimeMillis(),
                param.getVehicleType().getName(),
                param.getVehicleType().getId()
        );
        return vehicleRepository.save(entity);
    }

    @Override
    public List<VehicleEntity> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public BrandEntity createBrand(String brandName) {
        BrandEntity entity = new BrandEntity();
        entity.setBrandName(brandName);
        entity.setCreatedAt(System.currentTimeMillis());
        entity.setUpdatedAt(System.currentTimeMillis());
        return brandRepository.save(entity);
    }

    @Override
    public List<BrandEntity> getAllBrand() {
        return brandRepository.findAll();
    }

    @Override
    public List<BrandEntity> getBrandByName(String brandName) {
        return brandRepository.findBrandByBrandName(brandName);
    }

    @Override
    public ModelEntity createModel(int brandId, String modelName) {
        ModelEntity entity = new ModelEntity();
        entity.setBrandId(brandId);
        entity.setModelName(modelName);
        entity.setCreatedAt(System.currentTimeMillis());
        entity.setUpdatedAt(System.currentTimeMillis());
        return modelRepository.save(entity);
    }

    @Override
    public List<ModelEntity> getModelByName(String modelName) {
        return modelRepository.findModelByModelName(modelName);
    }

    @Override
    public List<ModelEntity> getAllModel() {
        return modelRepository.findAll();
    }

    @Override
    public List<ModelEntity> getModelByNameAndBrandId(int brandId, String modelName) {
        return modelRepository.findByBrandIdAndModelName(brandId,modelName);
    }

    @Override
    public List<ModelEntity> getModelByBrandId(int brandId) {
        return modelRepository.findModelByBrandId(brandId);
    }

    @Override
    public VehicleTypeEntity createVehicleType(String vehicleTypeName) {
        VehicleTypeEntity entity = new VehicleTypeEntity();
        entity.setVehicleTypeName(vehicleTypeName);
        entity.setCreatedAt(System.currentTimeMillis());
        entity.setUpdatedAt(System.currentTimeMillis());
        return vehicleTypeRepository.save(entity);
    }

    @Override
    public List<VehicleTypeEntity> getVehicleByName(String vehicleTypeName) {
        return vehicleTypeRepository.findVehicleTypeByVehicleTypeName(vehicleTypeName);
    }

    @Override
    public List<VehicleTypeEntity> getAllVehicleType() {
        return vehicleTypeRepository.findAll();
    }
}
