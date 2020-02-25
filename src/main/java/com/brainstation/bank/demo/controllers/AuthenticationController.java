package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.authConfig.JwtTokenProvider;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthenticationController {

    private AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;
    private UserRepository userRepository;

    public AuthenticationController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserRepository userRepository) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity signin(@RequestBody User user){
        try {
            String username = user.getUserId();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, user.getPassword()));
            String token = jwtTokenProvider.createToken(username, this.userRepository.findUserByUserId(username).orElseThrow(() -> new UsernameNotFoundException("Username" + user.getUserId() + "not found" )));
            Optional<UserDTO> userDTO = userRepository.findUserByUserId(user.getUserId());

            Map<Object, Object> model = new HashMap<>();
            model.put("username", username);
            model.put("token", token);
            model.put("id", userDTO);
            return ResponseEntity.ok(model);
        }
        catch(Exception e) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("User not found");
        }

    }
}
