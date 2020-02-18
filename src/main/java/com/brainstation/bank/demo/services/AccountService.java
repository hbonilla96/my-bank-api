package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.models.Account;
import org.springframework.stereotype.Service;

@Service
public abstract class AccountService {
    public abstract String generateAccountNumber(Account account);
}
