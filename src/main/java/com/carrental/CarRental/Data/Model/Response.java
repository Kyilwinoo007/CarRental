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

    public void setCode(int value) {
        code=value;
    }

    public void setMessage(String success) {
        message=success;
    }

    public void setResult(T userList) {
        Result=userList;
    }
}
