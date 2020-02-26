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

    public TransactionHistoryDTO(){}

    public TransactionHistoryDTO(TransactionHistory transactionHistory){
        this.id = transactionHistory.getId();
        this.accountNumber = transactionHistory.getAccountNumber();
        this.userId = transactionHistory.getUserId();
        this.transferAmount = transactionHistory.getTransferAmount();
        this.transactionDate = transactionHistory.getTransactionDate();
    }

    public TransactionHistoryDTO(String accountNumber, String userId, int transferAmount, Date transactionDate) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.transferAmount = transferAmount;
        this.transactionDate = transactionDate;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getUserId() {
        return userId;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
