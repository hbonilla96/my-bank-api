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
        TransactionHistory transactionHistory = new TransactionHistory();
        Date transactionDate = new Date();
        transactionHistory.setAccountNumber(transaction.getOriginAccount());
        transactionHistory.setTransferAmount(transaction.getTransferAmount());
        transactionHistory.setUserId(transaction.getUserId());
        transactionHistory.setTransactionDate(transactionDate);
        return transactionService.doTransaction(transaction,transactionHistory);
    }
}
