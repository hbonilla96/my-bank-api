package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.models.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.mail.MessagingException;
import java.util.List;

@Service
public abstract class UserService {
    public abstract String save(User user) throws MessagingException;
    public abstract String updatePassword(String userId, String newPassword);
}
