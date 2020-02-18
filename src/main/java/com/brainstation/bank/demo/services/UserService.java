package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.models.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public abstract class UserService {
    public abstract List<UserDTO> listAllUsers();
    public abstract UserDTO save(User user);
    public abstract UserDTO update(User user);
    public abstract UserDTO delete(@PathVariable("id")	long id);
}
