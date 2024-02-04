package com.carrental.CarRental.Data.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "VehicleType")
@ToString
public class VehicleTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String vehicleTypeName;   //Van,Sub,MVP,Sedan,MiniVan
    Long createdAt;
    Long updatedAt;
}
