package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.models.UserAuth;
import com.brainstation.bank.demo.repository.UserRepository;
import com.brainstation.bank.demo.services.UserAuthService;
import com.brainstation.bank.demo.services.UserService;

import java.util.List;

public class UserServiceImpl extends UserService {

    private UserRepository userRepository;
    private UserAuthService userAuthService;

    public UserServiceImpl(UserRepository userRepository, UserAuthService userAuthService) {
        this.userRepository = userRepository;
        this.userAuthService = userAuthService;
    }

    @Override
    public List<UserDTO> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDTO save(User user) {
        return userRepository.save(new UserDTO(user));
    }

    @Override
    public UserDTO update(User user) {
        return null;
    }

    @Override
    public UserDTO delete(long id) {
        return null;
    }
}
