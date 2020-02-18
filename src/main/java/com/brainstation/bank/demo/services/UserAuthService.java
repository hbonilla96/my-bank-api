package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.UserAuthDTO;
import com.brainstation.bank.demo.models.UserAuth;
import org.springframework.stereotype.Service;

@Service
public abstract class UserAuthService {
    public abstract UserAuthDTO save(UserAuth userAuth);
    public abstract UserAuthDTO update(UserAuth userAuth);
}
