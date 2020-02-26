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
}
