package com.brainstation.bank.demo.models;

import java.util.Date;

public class TransactionHistory {
    private int id;
    private String accountNumber;
    private String userId;
    private int transferAmount;
    private Date transactionDate;

    public TransactionHistory(){}

    public TransactionHistory(int id, String accountNumber, String userId, int transferAmount, Date transactionDate) {
        this.id = id;
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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public String getUserId() {
        return userId;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setHId(int id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }
}
