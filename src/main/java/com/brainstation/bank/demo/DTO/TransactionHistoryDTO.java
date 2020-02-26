package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.models.TransactionHistory;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction_history")
public class TransactionHistoryDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "transfer_amount")
    private int transferAmount;
    @Column(name = "transaction_date")
    private Date transactionDate;

    public TransactionHistoryDTO(TransactionHistory transactionHistory){
        this.id = transactionHistory.getId();
        this.accountNumber = transactionHistory.getAccountNumber();
        this.userId = transactionHistory.getUserId();
        this.transferAmount = transactionHistory.getTransferAmount();
        this.transactionDate = transactionHistory.getTransactionDate();
    }
}
