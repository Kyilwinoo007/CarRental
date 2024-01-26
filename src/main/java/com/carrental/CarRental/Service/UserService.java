package com.carrental.CarRental.Service;


import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.UserRegisterParam;
import com.carrental.CarRental.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;


    @Override
    public UserEntity saveUser(UserRegisterParam param) {
        UserEntity entity = new UserEntity();
        entity.setFirstName(param.getFirstName());
        entity.setLastName(param.getLastName());
        entity.setEmail(param.getEmail());
        entity.setPhone(param.getPhone());
        entity.setPassword(param.getPassword());
       return repository.save(entity);
    }

    @Override
    public void getUserById(int Id) {
        repository.getUserById(Id);
    }

    @Override
    public List<UserEntity> getUserByEmailAndPassword(String email, String password) {
        return repository.findByEmailAndPassword(email,password);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return repository.findAll();
    }


    //getAllUser
    //getUserById
    //saveUser
    //updateUser

}
