package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.models.Transaction;
import com.brainstation.bank.demo.services.TransactionService;
import org.springframework.web.bind.annotation.*;

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
        return transactionService.doTransaction(transaction);
    }
}
