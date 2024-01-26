package com.carrental.CarRental.Controller;

import com.carrental.CarRental.Data.Entity.UserEntity;
import com.carrental.CarRental.Data.Model.Response;
import com.carrental.CarRental.Data.Model.UserRegisterParam;
import com.carrental.CarRental.ResponseEntity.UserCustomException;
import com.carrental.CarRental.ResponseEntity.UserNotFoundException;
import com.carrental.CarRental.Service.IUserService;
import com.carrental.CarRental.Service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/login-user")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("user-login");
//        modelAndView.addObject("todoItems", todoItemService.getAll());
        return modelAndView;
    }

    @PostMapping("/register")
   ResponseEntity<UserEntity> registerUser(@Valid @RequestBody UserRegisterParam param){
        UserEntity entity =  userService.saveUser(param);
        return new ResponseEntity<>(entity,CREATED);
    }


    @PostMapping("/login")
    ResponseEntity<Response<List<UserEntity>>> loginUser(@RequestParam(value = "email")
                   String email,
                       @RequestParam(value = "password")
                   String password){
        if (email.isEmpty()){
            throw new UserCustomException("Email is required");
        }
        if (password.isEmpty()){
            throw new UserCustomException("Password is required");
        }

        List<UserEntity> userList = userService.getUserByEmailAndPassword(email,password);
        Response<List<UserEntity>> response = new Response<>();
        if (userList.isEmpty()){
           throw new UserNotFoundException("User Not Found");
        }else {
            response.setCode(HttpStatus.OK.value());
            response.setMessage("Success");
            response.setResult(userList);
        }
        //another form
        //success
        //error
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }

    void getUserById(String Id){

    }

    void updateUserInformation(@RequestBody UserEntity userEntity){
        //getUser
        // user.City = userEntity.getCity();
        //repository.save(user);
    }
}
