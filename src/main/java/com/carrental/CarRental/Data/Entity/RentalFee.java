package com.carrental.CarRental.Data.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RentalFee")
@ToString
public class RentalFee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    double feePerHr;
    double feePerDay;

    Long createdAt;
    Long updatedAt;
}


