package com.x4mv.webapp.springboot_web.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.x4mv.webapp.springboot_web.models.User;
import com.x4mv.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details") 
    public UserDto details(){

        UserDto userDto = new UserDto();
        User user = new User("Miguel", "Rios","Asuncion");

        userDto.setName("MI PRUEBA");
        userDto.setUser(user);
        
        /*

        la clase deberia de devolver un map en el caso de que lo usemos Map<String, Object> details(){}
        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
         */

        return userDto;
    }
}
