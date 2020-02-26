package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.models.TransactionHistory;
import org.springframework.stereotype.Service;

@Service
public abstract class TransactionHistoryService {
    public abstract void saveHistory(TransactionHistory transactionHistory);
}
