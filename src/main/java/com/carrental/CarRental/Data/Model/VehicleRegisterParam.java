package com.carrental.CarRental.Data.Model;

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
    @NotBlank(message = "Choose Car Brand")
    private Integer Brandid;

    @NotBlank(message = "Choose Car Model ")
    private int Modelid;

    @NotBlank(message = "Model Year is required")
    private int ModelYear;
    private String Color;

    @NotBlank(message = "Choose correct capacity")
    private String Capacity;
    @NotBlank(message = "Enter Correct Plate Number")
    private String PlateNumber;
    @NotBlank(message = "Choose correct Vehicle Type")
    private String VehicleTypeId;

}
