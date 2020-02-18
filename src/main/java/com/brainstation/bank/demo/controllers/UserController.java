package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.configuration.CustomPasswordGenerator;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO save(@RequestBody User user){
        CustomPasswordGenerator customPasswordGenerator = new CustomPasswordGenerator();
        user.setPassword(customPasswordGenerator.generatePassayPassword());
        return userService.save(user);
    }
}
