package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.configuration.CustomPasswordGenerator;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.models.UserAuth;
import com.brainstation.bank.demo.services.UserAuthService;
import com.brainstation.bank.demo.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;
    private UserAuthService userAuthService;
    private CustomPasswordGenerator passwordGenerator;

    public UserController(UserService userService, UserAuthService userAuthService, CustomPasswordGenerator passwordGenerator) {
        this.userService = userService;
        this.userAuthService = userAuthService;
        this.passwordGenerator = passwordGenerator;
    }

    public UserDTO save(@RequestBody User user){
        UserAuth userAuth = new UserAuth(user.getId(), passwordGenerator.generatePassayPassword());
        userAuthService.save(userAuth);
        return userService.save(user);
    }
}
