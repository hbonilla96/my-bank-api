package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.models.TransactionHistory;

public abstract class TransactionHistoryService {
    public abstract void saveHistory(TransactionHistory transactionHistory);
}
