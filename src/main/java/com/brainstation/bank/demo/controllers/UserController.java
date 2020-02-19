package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.configuration.CustomPasswordGenerator;
import com.brainstation.bank.demo.configuration.UserAge;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String save(@RequestBody User user) throws MessagingException {
        CustomPasswordGenerator customPasswordGenerator = new CustomPasswordGenerator();
        user.setPassword(customPasswordGenerator.generatePassayPassword());
        UserAge userAge = new UserAge();
        user.setAge(userAge.getAge(user.getBirthDate()));
        userService.save(user);
        return customPasswordGenerator.generatePassayPassword();
    }

    @PutMapping
    public String changePassword(@RequestBody User user){
        return userService.updatePassword(user.getUserId(), user.getPassword());
    }
}
