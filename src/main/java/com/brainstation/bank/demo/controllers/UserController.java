package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.utils.CustomPasswordGenerator;
import com.brainstation.bank.demo.utils.Email;
import com.brainstation.bank.demo.utils.UserAge;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;
    private Email email;
    private UserAge userAge;
    private CustomPasswordGenerator customPasswordGenerator;

    public UserController(UserService userService, Email email, UserAge userAge, CustomPasswordGenerator customPasswordGenerator) {
        this.userService = userService;
        this.email = email;
        this.userAge = userAge;
        this.customPasswordGenerator = customPasswordGenerator;
    }

    @PostMapping
    public String save(@RequestBody User user) throws MessagingException {
        String password = (customPasswordGenerator.generatePassayPassword());
        user.setPassword(password);
        user.setAge(userAge.getAge(user.getBirthDate()));
        userService.save(user);
        email.sendEmail(user.getEmail(), "Welcome to myBank ","Hi " + user.getName() + " " + user.getLastName() + " " + "Your password is: " + password);
        return password;
    }

    @PutMapping("/update-password")
    public String changePassword(@RequestBody User user){
        return userService.updatePassword(user.getUserId(), user.getPassword());
    }
}
