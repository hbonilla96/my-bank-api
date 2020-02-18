package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.AccountDTO;
import com.brainstation.bank.demo.enums.AccountTypes;
import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.repository.AccountRepository;
import com.brainstation.bank.demo.services.AccountService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AccountServiceImpl extends AccountService {

    private AccountRepository accountRepository;
    private String IBAN = "CR080";
    private long num = 15097654234567890L;

    int randomInt = ThreadLocalRandom.current().nextInt(1, 51);

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public String generateAccountNumber(Account account) {
        num++;
        if(account.getType().equals(AccountTypes.DEBIT)){
            account.setAccountNumber(IBAN = IBAN + num);
        }
        accountRepository.save(new AccountDTO(account));
        return "first" + num;
    }
}
