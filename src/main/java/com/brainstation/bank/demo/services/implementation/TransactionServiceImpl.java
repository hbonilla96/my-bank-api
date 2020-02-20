package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.TransactionDTO;
import com.brainstation.bank.demo.models.Transaction;
import com.brainstation.bank.demo.repository.AccountRepository;
import com.brainstation.bank.demo.repository.TransactionRepository;
import com.brainstation.bank.demo.services.TransactionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionServiceImpl extends TransactionService {

    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public String doTransaction(Transaction transaction) {
        String msj = "";
        int balanceOrigin = accountRepository.findAllByAccountNumber(transaction.getOriginAccount());

        if(accountRepository.find(transaction.getDestinationAccount()).equals(transaction.getCurrency())){
            if(balanceOrigin >= transaction.getTransferAmount() ){
                transactionRepository.save(new TransactionDTO(transaction));
                accountRepository.updateBalanceDestination(transaction.getTransferAmount(),transaction.getDestinationAccount());
                accountRepository.updateBalanceOrigin(transaction.getTransferAmount(),transaction.getOriginAccount());
                msj = "yey";
            }else{
                msj = "The account does not have the funds to complete the transaction";
            }
        }else{
            msj = "The currency on the destination and origin account should be the same";
        }
        return msj;
    }
}
