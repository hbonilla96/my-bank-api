package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.models.TransactionHistory;
import com.brainstation.bank.demo.services.TransactionHistoryService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/history")
public class TransactionHistoryController {

    private TransactionHistoryService transactionHistoryService;

    public TransactionHistoryController(TransactionHistoryService transactionHistoryService) {
        this.transactionHistoryService = transactionHistoryService;
    }

    @PostMapping
    public void saveHistory(@RequestBody TransactionHistory transactionHistory){
        transactionHistoryService.saveHistory(transactionHistory);
    }
}
