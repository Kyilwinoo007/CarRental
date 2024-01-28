package com.carrental.CarRental.Service;
import com.carrental.CarRental.Data.Entity.OwnerEntity;
import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.OwnerRegisterParam;
import com.carrental.CarRental.Data.Model.UserRegisterParam;

import java.util.List;
public interface IOwnerService {
    OwnerEntity saveOwner(OwnerRegisterParam param);
    List<OwnerEntity> getOwnerByEmailAndPassword(String email, String password);

    OwnerEntity   updateOwner(OwnerEntity owner);

    OwnerEntity getOwnerById(int id);

    void updateOwnerPhone(int id,String phone);
}
