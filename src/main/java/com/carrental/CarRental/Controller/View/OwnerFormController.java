package com.carrental.CarRental.Controller.View;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/owner")
public class OwnerFormController {
    @GetMapping("/owner-login")
    public String loginUser() {
        return "owner-login";
    }
    @GetMapping("/owner-register")
    public String registerUser(){
        return "owner-register";
    }
}
