package com.carrental.CarRental.Data.Model;

import jakarta.validation.constraints.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserRegisterParam {


    @NotBlank(message = "First Name is required")
    @Size(min = 2,message = "First name must be at least 2 characters")
    private String firstName;


    @NotBlank(message = "Last Name is required")
    @Size(min = 2,message = "Last name must be at least 2 characters")
    private String lastName;

    @NotBlank
    @Email
    private String email;

    private String phone;


    @NotBlank
    @Size(min = 8)
    private String password;

}
