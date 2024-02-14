package com.carrental.CarRental.Service;


import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.UserInfoParam;
import com.carrental.CarRental.Data.Model.UserRegisterParam;
import com.carrental.CarRental.Repository.UserRepository;
import com.carrental.CarRental.ResponseEntity.UserNotFoundException;
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
    public List<UserEntity> getUserByEmailAndPassword(String email, String password) {
        return repository.findByEmailAndPassword(email,password);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return repository.findAll();
    }


    @Override
    public UserEntity getUserById(int id) {
        return repository.getUserById(id);
    }

    @Override
    public void updatePhone(int id, String phone) {
         repository.updatePhone(id,phone);
    }

    @Override
    public UserEntity updateUserInfo(int id, UserInfoParam userInfoParam) {
        UserEntity user = getUserById(id);
        if (user == null){
            throw new UserNotFoundException("User does not exist!");
        }
        user.setPhone(userInfoParam.getPhone());
        user.setDob(userInfoParam.getDob());
        user.setHomeNo(userInfoParam.getHomeNo());
        user.setTownShip(userInfoParam.getTownShip());
        user.setCity(userInfoParam.getCity());
        user.setCountry(userInfoParam.getCountry());
        user.setIcNo(userInfoParam.getIcNo());
        user.setFather_name(userInfoParam.getFather_name());
        user.setUpdatedAt(System.currentTimeMillis() + "");
        return repository.save(user);
    }


}
