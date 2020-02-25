package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.AccountDTO;
import com.brainstation.bank.demo.models.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AccountService {
    public abstract String generateAccountNumber(Account account);
    public abstract List<AccountDTO> getAccountByUser(int userId);
}
