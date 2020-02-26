package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.AccountDTO;
import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.repository.AccountRepository;
import com.brainstation.bank.demo.services.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl extends AccountService {

    private AccountRepository accountRepository;
    private String IBAN = "CR080";
    private long num = 10400142533033018L;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public String generateAccountNumber(Account account) {
        if(account.getType().equals("debit")){
            // create colones account
            num++;
            account.setCurrency("colones");
            account.setAccountNumber(IBAN + num);
            accountRepository.save(new AccountDTO(account));

            //create dolar account
            num++;
            account.setCurrency("dolars");
            account.setAccountNumber(IBAN + num);
            accountRepository.save(new AccountDTO(account));
        }else {
            if (account.getType().equals("credit")){
                num++;
                account.setCurrency("colones");
                account.setAccountNumber(IBAN + num);
                accountRepository.save(new AccountDTO(account));
            }
        }
        return "account created" + " number: " + (IBAN + num);
    }

    @Override
    public List<AccountDTO> getAccountByUser(int userId) {
        return accountRepository.getAccountDTOByUserId(userId);
    }

    @Override
    public List<AccountDTO> getAccountByUserName(String accountNumber, String userName) {
        return accountRepository.getAccountDTOByAccountNumberAndUserName(accountNumber,userName);
    }


}
