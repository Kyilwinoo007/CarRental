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
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;
    String dob;
    String homeNo;
    String townShip;
    String city;
    String country;
    String icNo;
    String fatherName;
    String createdAt;
    String updatedAt;

}
