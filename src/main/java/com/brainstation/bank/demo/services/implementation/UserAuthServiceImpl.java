package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.UserAuthDTO;
import com.brainstation.bank.demo.models.UserAuth;
import com.brainstation.bank.demo.repository.UserAuthRepository;
import com.brainstation.bank.demo.services.UserAuthService;

public class UserAuthServiceImpl extends UserAuthService {

    private UserAuthRepository userAuthRepository;

    public UserAuthServiceImpl(UserAuthRepository userAuthRepository) {
        this.userAuthRepository = userAuthRepository;
    }

    @Override
    public UserAuthDTO save(UserAuth userAuth) {
        return userAuthRepository.save(new UserAuthDTO(userAuth));
    }

    @Override
    public UserAuthDTO update(UserAuth userAuth) {
        return null;
    }
}
