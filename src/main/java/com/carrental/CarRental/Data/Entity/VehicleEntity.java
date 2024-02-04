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
    int brandId; //Toyota,Honda,Nissan
    int modelId; //wish,note,odyssey

    String modelYear;
    String color;
    int capacity;  //4 seaters  not applicable

    String plateNumber;

    Long registerDate;
    int vehicleTypeId;  //sub,minivan
    boolean isActive;  //system

    Long createdAt;
    Long updatedAt;



}
