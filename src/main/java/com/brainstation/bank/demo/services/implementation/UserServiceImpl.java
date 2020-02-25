package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.UserDTO;
import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.models.User;
import com.brainstation.bank.demo.repository.UserRepository;
import com.brainstation.bank.demo.services.AccountService;
import com.brainstation.bank.demo.services.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl extends UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private AccountService accountService;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, AccountService accountService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.accountService = accountService;
    }

    @Override
    public String save(User user) {
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        UserDTO userDTO = new UserDTO(user);
        userRepository.save(userDTO);
        Account account = new Account();
        account.setType("debit");
        account.setBalance(0);
        account.setUserId(userDTO.getId());
        account.setAccountHolder(userDTO.getName() + " " + userDTO.getLastName());
        accountService.generateAccountNumber(account);
        return "user saved";
    }

    @Override
    public String updatePassword(String userId, String newPassword) {
        newPassword = this.passwordEncoder.encode(newPassword);
        userRepository.changePassword(userId,newPassword);
        return "password changed";
    }
}
