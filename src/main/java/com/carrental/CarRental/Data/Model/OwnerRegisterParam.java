package com.carrental.CarRental.Data.Model;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OwnerRegisterParam {

    @NotBlank(message = "First Name is required")
    private String firstName;


    @NotBlank(message = "Last Name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",message = "Email is not valid")
    private String email;

    private String phone;


    @NotBlank(message = "Password is required")
    @Size(min = 8,message = "Password must be at least 8 characters")
    private String password;
}
