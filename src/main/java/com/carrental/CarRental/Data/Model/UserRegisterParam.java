package com.carrental.CarRental.Data.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserRegisterParam {

    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;
    @Email()
    private String email;

    @Past
    private String phone;

    @Size(min = 8)
    private String password;

}
