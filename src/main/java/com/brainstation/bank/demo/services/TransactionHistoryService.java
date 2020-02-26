package com.brainstation.bank.demo.services;

import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import com.brainstation.bank.demo.models.TransactionHistory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class TransactionHistoryService {
    public abstract void saveHistory(TransactionHistory transactionHistory);
    public abstract List<TransactionHistoryDTO> getHistoryByUser(String userId);
}
