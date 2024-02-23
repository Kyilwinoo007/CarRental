package com.carrental.CarRental.Data.Entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "VehicleAvailability")
@ToString
public class VehicleAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int vehicleId;
    int rentTypId;
    int rentFeeId;
    Long createdAt;
    Long updatedAt;
}

