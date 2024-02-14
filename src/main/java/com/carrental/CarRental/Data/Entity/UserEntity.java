package com.carrental.CarRental.Data.Entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "User")
@ToString
public class UserEntity {
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
    String father_name;
    String createdAt;
    String updatedAt;

}
