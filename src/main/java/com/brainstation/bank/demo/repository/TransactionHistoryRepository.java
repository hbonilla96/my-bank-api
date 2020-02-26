package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.FavoriteAccountDTO;
import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistoryDTO, Long> {

    List<TransactionHistoryDTO> getTransactionHistoryDTOByUserId(@Param("userId") String userId);
}
