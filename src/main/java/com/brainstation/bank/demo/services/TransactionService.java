package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.models.Transaction;
import org.springframework.stereotype.Service;

@Service
public abstract class TransactionService {
    public abstract String doTransaction(Transaction transaction);
}
