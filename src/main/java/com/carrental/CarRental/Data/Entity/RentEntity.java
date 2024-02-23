package com.carrental.CarRental.Data.Entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RentVehicle")
@ToString
public class RentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int vehicleId;
    int userId;
    String status;
    Long startDate;

}
