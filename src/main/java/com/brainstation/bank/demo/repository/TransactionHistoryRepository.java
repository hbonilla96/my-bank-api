package com.brainstation.bank.demo.repository;

import com.brainstation.bank.demo.DTO.TransactionHistoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistoryDTO, Long> {

    List<TransactionHistoryDTO> getTransactionHistoryDTOByUserId(@Param("userId") String userId);

    List<TransactionHistoryDTO> getTransactionHistoryDTOByAccountNumberAndUserId
            (@Param("accountNumber") String accountNumber, @Param("userId") String userId);

    @Query("select sum(t.transferAmount)  from TransactionHistoryDTO t where t.userId = :userId and t.transactionDate between '2020-01-01' and '2020-01-31' ")
    String getExpensesForMonthJanuary(@Param("userId") String userId);

    @Query("select sum(t.transferAmount)  from TransactionHistoryDTO t where t.userId = :userId and t.transactionDate between '2020-02-01' and '2020-02-29'")
    String getExpensesForMonthFebruary(@Param("userId") String userId);

    @Query("select sum(t.transferAmount)  from TransactionHistoryDTO t where t.userId = :userId and t.transactionDate between '2020-03-01' and '2020-03-31'")
    String getExpensesForMonthMarch(@Param("userId") String userId);

    @Query("select sum(t.transferAmount)  from TransactionHistoryDTO t where t.userId = :userId and t.transactionDate between '2020-04-01' and '2020-04-30'")
    String getExpensesForMonthApril(@Param("userId") String userId);

    @Query("select sum(t.transferAmount)  from TransactionHistoryDTO t where t.userId = :userId and t.transactionDate between '2020-05-01' and '2020-05-31'")
    String getExpensesForMonthMay(@Param("userId") String userId);

    @Query("select sum(t.transferAmount)  from TransactionHistoryDTO t where t.userId = :userId and t.transactionDate between '2020-06-01' and '2020-06-31'")
    String getExpensesForMonthJune(@Param("userId") String userId);
}
