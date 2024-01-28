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
//        entity.setFirstName(param.getFirstName());
//        entity.setLastName(param.getLastName());
//        entity.setEmail(param.getEmail());
//        entity.setPhone(param.getPhone());
//        entity.setPassword(param.getPassword());
       return repository.save(entity);
    }


    @Override
    public List<UserEntity> getUserByEmailAndPassword(String email, String password) {
        return repository.findByEmailAndPassword(email,password);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return repository.findAll();
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
//        var result  = getUserById(user.getId());
//        result.setPassword(user.getPassword());
//        repository.save(result);
        return null;
    }

    @Override
    public UserEntity getUserById(int id) {
        return null;
    }

    @Override
    public void updatePhone(int id, String phone) {
         repository.updatePhone(id,phone);
    }


    //getAllUser
    //getUserById
    //saveUser
    //updateUser

}
