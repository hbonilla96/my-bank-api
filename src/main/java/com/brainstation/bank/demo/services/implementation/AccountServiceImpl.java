package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.AccountDTO;
import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.repository.AccountRepository;
import com.brainstation.bank.demo.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends AccountService {

    private AccountRepository accountRepository;
    private String IBAN = "CR080";
    private long num = 10400142533033018L;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public String generateAccountNumber(Account account) {
        num++;
        account.setAccountNumber(IBAN + num);

        accountRepository.save(new AccountDTO(account));
        return "account created";
    }
}
