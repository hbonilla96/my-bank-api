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
    @Column(name = "transaction_id")
    private int transactionId;
    @Column(name = "transaction_date")
    private Date transactionDate;

    public TransactionHistoryDTO(TransactionHistory transactionHistory){
        this.id = transactionHistory.getId();
        this.transactionId = transactionHistory.getTransactionId();
        this.transactionDate = transactionHistory.getTransactionDate();
    }
}
