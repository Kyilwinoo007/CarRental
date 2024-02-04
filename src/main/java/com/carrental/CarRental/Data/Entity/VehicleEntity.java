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
    int brandId; // toyota , Honda,
    int modelId; // wish,
    String modelYear;
    String color;
    int capacity; // 4 seaters, 3 seaters etc
    String plateNumber;
    long registerDate;
    int vehicleTypeId; // sub,minivan
    boolean isActive;
    long createdAt;
    long updatedAt;



}
