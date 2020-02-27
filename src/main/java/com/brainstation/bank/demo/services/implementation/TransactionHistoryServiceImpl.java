package com.brainstation.bank.demo.services.implementation;

import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import com.brainstation.bank.demo.models.TransactionHistory;
import com.brainstation.bank.demo.repository.TransactionHistoryRepository;
import com.brainstation.bank.demo.services.TransactionHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionHistoryServiceImpl extends TransactionHistoryService {

    private TransactionHistoryRepository transactionHistoryRepository;

    public TransactionHistoryServiceImpl(TransactionHistoryRepository transactionHistoryRepository) {
        this.transactionHistoryRepository = transactionHistoryRepository;
    }

    @Override
    public void saveHistory(TransactionHistory transactionHistory) {
        transactionHistoryRepository.save(new TransactionHistoryDTO(transactionHistory));
    }

    @Override
    public List<TransactionHistoryDTO> getHistoryByUser(String userId) {
        return transactionHistoryRepository.getTransactionHistoryDTOByUserId(userId);
    }

    @Override
    public List<TransactionHistoryDTO> getHistoryByAccountAndUser(String accountNumber, String userId) {
        return transactionHistoryRepository.getTransactionHistoryDTOByAccountNumberAndUserId(accountNumber,userId);
    }

    @Override
    public String getJanuaryExpenses(String userId) {
        return transactionHistoryRepository.getExpensesForMonthJanuary(userId);
    }

    @Override
    public String getFebruaryExpenses(String userId) {
        return transactionHistoryRepository.getExpensesForMonthFebruary(userId);
    }

    @Override
    public String getMarchExpenses(String userId) {
        return transactionHistoryRepository.getExpensesForMonthMarch(userId);
    }

    @Override
    public String getAprilExpenses(String userId) {
        return transactionHistoryRepository.getExpensesForMonthApril(userId);
    }

    @Override
    public String getMayExpenses(String userId) {
        return transactionHistoryRepository.getExpensesForMonthMay(userId);
    }

    @Override
    public String getJuneExpenses(String userId) {
        return transactionHistoryRepository.getExpensesForMonthJune(userId);
    }

}
