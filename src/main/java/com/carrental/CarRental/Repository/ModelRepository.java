package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<ModelEntity,Integer> {
    List<ModelEntity> findModelByModelName(String modelName);

    List<ModelEntity> findByBrandIdAndModelName(int brandId,String modelName);

    List<ModelEntity> findModelByBrandId(int brandId);
}
