package com.brainstation.bank.demo.controllers;

import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import com.brainstation.bank.demo.models.TransactionHistory;
import com.brainstation.bank.demo.services.TransactionHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{userId}")
    public List<TransactionHistoryDTO> getAllTransactionByUser(@PathVariable("userId") String userId){
        return transactionHistoryService.getHistoryByUser(userId);
    }
}
