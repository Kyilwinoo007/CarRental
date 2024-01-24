package com.carrental.CarRental.Data.Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Response<T> {
    int code;
    String message;
    T Result;

}
