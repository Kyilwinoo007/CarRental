package com.carrental.CarRental.Data.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {

    @Min(value = 0,message = "Id is required")
    int id;

    @NotBlank(message = "Name is required")
    String name;

}
