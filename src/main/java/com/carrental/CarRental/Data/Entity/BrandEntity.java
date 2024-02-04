package com.carrental.CarRental.Data.Entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Brand")
@ToString
public class BrandEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    int brandId;
    String brandName;
    long createdAt;
    long updatedAt;
}
