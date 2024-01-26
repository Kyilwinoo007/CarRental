package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.UserRegisterParam;

import java.util.List;

public interface IUserService {
    UserEntity saveUser(UserRegisterParam param);
    void getUserById(int Id);
    List<UserEntity> getUserByEmailAndPassword(String email, String password);
}
