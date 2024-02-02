package com.carrental.CarRental.Controller.View;


import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/v1/user")
public class UserFormController {
    @GetMapping("/user-login")
    public String loginUser() {
        return "user-login";
    }
    @GetMapping("/user-register")
    public String registerUser(){
        return "user-register";
    }
    @GetMapping("/home")
    public String getHome(HttpServletRequest request, Model model) {
        return "home";
    }

}
