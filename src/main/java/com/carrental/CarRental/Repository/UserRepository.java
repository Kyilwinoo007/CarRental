package com.carrental.CarRental.Repository;

import com.carrental.CarRental.Data.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    List<UserEntity> findByEmailAndPassword(String email,String password);
    UserEntity getUserById(int id);

    List<UserEntity> findAll();

//    @Modifying
//    @Query("Select * From user")
//    List<UserEntity> findFirst20Rows();

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update User u set u.phone = :phone where u.id = :id",
    nativeQuery = true)
    int updatePhone(@Param(value = "id") int id, @Param(value = "phone") String phone);
}

