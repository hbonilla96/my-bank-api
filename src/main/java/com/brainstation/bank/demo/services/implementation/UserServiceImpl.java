package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.repository.UserRepository;
import com.brainstation.bank.demo.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO save(User user) {
        return userRepository.save(new UserDTO(user));
    }
}
