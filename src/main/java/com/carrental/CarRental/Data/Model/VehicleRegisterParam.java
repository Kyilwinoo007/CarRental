package com.carrental.CarRental.Data.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VehicleRegisterParam {

    //brandId (Toyota,Nissan)
    //modelId (Wish,Corolla,Note)
    //ModelYear
    //Color
    //Capacity (2 Seats,4 Seaters,5 Seaters,7 seaters,10,15 seaters)
    //PlateNumber
    //registerDate (register at system)
    //VehicleTypeId (Van,Sub,MVP,Sedan,MiniVan)
    //isActive (true,false)  //optional //logic
    @Min(value = 0,message = "Choose Car Brand")
    private int brandId;

    @Min(value =  0,message = "Choose Car Model ")
    private int modelId;

    @NotBlank(message = "Model Year is required")
    private String modelYear;
    private String color;

    @Min(value = 0,message = "Capacity is required")
    private int capacity;
    @NotBlank(message = "Enter Correct Plate Number")
    private String plateNumber;


    @Min(value = 0,message = "Choose correct Vehicle Type")
    private int vehicleTypeId;

}
