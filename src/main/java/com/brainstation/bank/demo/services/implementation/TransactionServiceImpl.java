package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.models.Transaction;
import com.brainstation.bank.demo.repository.AccountRepository;
import com.brainstation.bank.demo.repository.TransactionRepository;
import com.brainstation.bank.demo.services.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl extends TransactionService {

    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public String doTransaction(Transaction transaction) {
        String exists = "";

        if(accountRepository.countAccountDTO(transaction.getIdUserCu(), transaction.getAccountNumber()).equals("1")){
            exists =  "account exists";
        }
        return exists;
    }
}
