package com.brainstation.bank.demo.models;

public class Transaction {
    private int transactionId;
    private int originAccount;
    private int destinationAccount;
    private String currency;
    private int transferAmount;
    private String transferDetail;

    public Transaction(int transactionId, int originAccount, int destinationAccount, String currency, int transferAmount, String transferDetail) {
        this.transactionId = transactionId;
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
        this.currency = currency;
        this.transferAmount = transferAmount;
        this.transferDetail = transferDetail;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getOriginAccount() {
        return originAccount;
    }

    public String getCurrency() {
        return currency;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public String getTransferDetail() {
        return transferDetail;
    }

    public int getDestinationAccount() {
        return destinationAccount;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setOriginAccount(int originAccount) {
        this.originAccount = originAccount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public void setTransferDetail(String transferDetail) {
        this.transferDetail = transferDetail;
    }

    public void setDestinationAccount(int destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
