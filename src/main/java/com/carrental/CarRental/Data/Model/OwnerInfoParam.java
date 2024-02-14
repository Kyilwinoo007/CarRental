package com.carrental.CarRental.Data.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OwnerInfoParam {
    private String phone;

    private String dob;
    private String homeNo;
    private String townShip;
    private String city;
    private String country;
    private String icNo;
    private String father_name;
    private String updatedAt;
}
