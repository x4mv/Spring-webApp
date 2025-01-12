package com.x4mv.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.x4mv.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details") 
    public String details(Model model ){

        User user = new User("Miguel", "Rios", "Saint Laurent");

        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);
    
        
        return "details";
    }
}
