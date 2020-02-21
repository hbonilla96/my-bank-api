package com.brainstation.bank.demo.models;

import java.util.Date;

public class TransactionHistory {
    private int id;
    private int transactionId;
    private Date transactionDate;

    public TransactionHistory(int id, int transactionId, Date transactionDate) {
        this.id = id;
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
    }

    public int getId() {
        return id;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setHId(int id) {
        this.id = id;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
