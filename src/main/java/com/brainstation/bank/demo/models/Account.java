package com.brainstation.bank.demo.models;

public class Account {
    private int id;
    private String accountNumber;
    private String type;
    private String currency;
    private String balance;
    private int userId;

    public Account(int id, String accountNumber, String type, String currency, String balance, int userId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.type = type;
        this.currency = currency;
        this.balance = balance;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public String getBalance() {
        return balance;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
