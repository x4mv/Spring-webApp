package com.x4mv.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRestController {

    @GetMapping("/details") 
    public String details(Model model ){

        model.addAttribute("title", "Hola mundo");
        model.addAttribute("name", "Sergio");
        model.addAttribute("lastName", "Caceres ");
        
        return "details";
    }
}
