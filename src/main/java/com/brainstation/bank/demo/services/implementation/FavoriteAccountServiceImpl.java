package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import com.brainstation.bank.demo.models.FavoriteAccount;
import com.brainstation.bank.demo.repository.FavoriteAccountRepository;
import com.brainstation.bank.demo.services.FavoriteAccountService;
import org.springframework.stereotype.Service;

@Service
public class FavoriteAccountServiceImpl extends FavoriteAccountService {

    private FavoriteAccountRepository favoriteAccountRepository;

    public FavoriteAccountServiceImpl(FavoriteAccountRepository favoriteAccountRepository) {
        this.favoriteAccountRepository = favoriteAccountRepository;
    }

    @Override
    public FavoriteAccountDTO save(FavoriteAccount favoriteAccount) {
        return favoriteAccountRepository.save(new FavoriteAccountDTO(favoriteAccount));
    }
}
