package com.carrental.CarRental.Data.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Vehicle")
@ToString
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String brand;
    int brandId; //Toyota,Honda,Nissan


    String model;
    int modelId; //wish,note,odyssey

    String modelYear;
    String color;
    int capacity;  //4 seaters  not applicable

    String plateNumber;

    Long registerDate;

    String vehicleType;
    int vehicleTypeId;  //sub,minivan
    boolean isActive;  //system

    int rentalId;
    int feeId;
    boolean status;

    Long createdAt;
    Long updatedAt;

    public VehicleEntity(String brand, int brandId, String model, int modelId, String modelYear, String color, int capacity, String plateNumber, Long registerDate, String vehicleType, int vehicleTypeId) {
        this.brand = brand;
        this.brandId = brandId;
        this.model = model;
        this.modelId = modelId;
        this.modelYear = modelYear;
        this.color = color;
        this.capacity = capacity;
        this.plateNumber = plateNumber;
        this.registerDate = registerDate;
        this.vehicleType = vehicleType;
        this.vehicleTypeId = vehicleTypeId;
    }
}
