package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.models.Transaction;
import com.brainstation.bank.demo.models.TransactionHistory;
import com.brainstation.bank.demo.services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {
    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public String doTransaction(@RequestBody Transaction transaction){
        //origin account history

        TransactionHistory transactionHistoryOrigin = new TransactionHistory();
        Date transactionDate = new Date();
        transactionHistoryOrigin.setAccountNumber(transaction.getOriginAccount());
        transactionHistoryOrigin.setTransferAmount(transaction.getTransferAmount());
        transactionHistoryOrigin.setUserId(transaction.getUserId());
        transactionHistoryOrigin.setTransactionDate(transactionDate);
        transactionHistoryOrigin.setTransferMovement("debit");

        //destination account history
        TransactionHistory transactionHistoryDestination = new TransactionHistory();
        transactionHistoryDestination.setAccountNumber(transaction.getDestinationAccount());
        transactionHistoryDestination.setTransferAmount(transaction.getTransferAmount());
        transactionHistoryDestination.setTransferMovement("credit");
        transactionHistoryDestination.setTransactionDate(transactionDate);
        transactionHistoryDestination.setUserId(transaction.getUserId());

        return transactionService.doTransaction(transaction,transactionHistoryOrigin,transactionHistoryDestination);
    }
}
