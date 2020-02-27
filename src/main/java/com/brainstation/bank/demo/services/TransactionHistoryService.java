package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import com.brainstation.bank.demo.models.TransactionHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class TransactionHistoryService {
    public abstract void saveHistory(TransactionHistory transactionHistory);
    public abstract List<TransactionHistoryDTO> getHistoryByUser(String userId);
    public abstract List<TransactionHistoryDTO> getHistoryByAccountAndUser(String accountNumber, String userId);
    public abstract String getJanuaryExpenses(String userId);
    public abstract String getFebruaryExpenses(String userId);
    public abstract String getMarchExpenses(String userId);
    public abstract String getAprilExpenses(String userId);
    public abstract String getMayExpenses(String userId);
    public abstract String getJuneExpenses(String userId);
}
