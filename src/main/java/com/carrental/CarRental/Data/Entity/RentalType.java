package com.carrental.CarRental.Data.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "RentalType")
@ToString
public class RentalType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;   //Highway,City,Both
    Long createdAt;
    Long updatedAt;
}
