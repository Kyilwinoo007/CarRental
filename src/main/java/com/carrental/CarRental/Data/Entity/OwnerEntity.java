package com.carrental.CarRental.Data.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity
@Table (name="Owner")
@ToString

public class OwnerEntity {
    //First Name
    //Last Name
    //email required
    //phone optional
    //password
    //createVehicle
    //Dob
    //HomeNo.
    //Township
    //City
    //Country
    //ICNo.
    //CreatedAt
    //UpdatedAt
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;
    String createVehicle;

    String dob;
    String homeNo;
    String townShip;
    String city;
    String country;
    String icNo;
    String createdAt;
    String updatedAt;

}
