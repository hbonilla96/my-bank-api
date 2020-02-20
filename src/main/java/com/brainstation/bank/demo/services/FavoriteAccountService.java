package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import com.brainstation.bank.demo.models.FavoriteAccount;
import org.springframework.stereotype.Service;

@Service
public abstract class FavoriteAccountService {
    public abstract FavoriteAccountDTO save(FavoriteAccount favoriteAccount);
}
