package com.brainstation.bank.demo.models;

public class Transaction {
    private int transactionId;
    private String originAccount;
    private String destinationAccount;
    private String currency;
    private int transferAmount;
    private String transferDetail;
    private String userId;

    public Transaction(int transactionId, String originAccount, String destinationAccount, String currency, int transferAmount, String transferDetail, String userId) {
        this.transactionId = transactionId;
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
        this.currency = currency;
        this.transferAmount = transferAmount;
        this.transferDetail = transferDetail;
        this.userId = userId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getOriginAccount() {
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

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public String getUserId() {
        return userId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setOriginAccount(String originAccount) {
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

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
