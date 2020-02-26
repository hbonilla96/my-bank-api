package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import com.brainstation.bank.demo.models.TransactionHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class TransactionHistoryService {
    public abstract void saveHistory(TransactionHistory transactionHistory);
    public abstract List<TransactionHistoryDTO> getHistoryByUser(String userId);
    public abstract int getJanuaryExpenses(String userId);
    public abstract int getFebruaryExpenses(String userId);
    public abstract int getMarchExpenses(String userId);
    public abstract int getAprilExpenses(String userId);
    public abstract int getMayExpenses(String userId);
    public abstract int getJuneExpenses(String userId);
}
