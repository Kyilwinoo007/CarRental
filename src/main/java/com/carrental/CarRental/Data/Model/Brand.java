package com.carrental.CarRental.Data.Model;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Brand {

    int id;

    @NotBlank(message = "Brand Name is required")
    String name;

    Long createdAt;
    Long updatedAt;
    //id
    //Name (Toyota,Nissan)
    //createdAt
    //updatedAt
}
