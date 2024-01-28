package com.carrental.CarRental.Service;

import com.carrental.CarRental.Data.Entity.OwnerEntity;
import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.OwnerRegisterParam;
import com.carrental.CarRental.Data.Model.UserRegisterParam;
import com.carrental.CarRental.Repository.OwnerRepository;
import com.carrental.CarRental.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService {

    @Autowired
    OwnerRepository ownerRepo;

    @Override
    public OwnerEntity saveOwner(OwnerRegisterParam param) {
        OwnerEntity owner = new OwnerEntity();
        owner.setFirstName(param.getFirstName());
        owner.setLastName(param.getLastName());
        owner.setEmail(param.getEmail());
        owner.setPassword(param.getPassword());
        return ownerRepo.save(owner);

    }

    @Override
    public List<OwnerEntity> getOwnerByEmailAndPassword(String email, String password) {
        return null;
    }

    @Override
    public OwnerEntity updateOwner(OwnerEntity owner) {
        return null;
    }

    @Override
    public OwnerEntity getOwnerById(int id) {
        return null;
    }

    @Override
    public void updateOwnerPhone(int id, String phone) {

    }
}
