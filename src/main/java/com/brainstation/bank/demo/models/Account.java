package com.brainstation.bank.demo.models;

public class Account {
    private int id;
    private String accountNumber;
    private String accountHolder;
    private int balance;
    private String type;
    private String currency;
    private int userId;

    public Account(){}

    public Account(int id, String accountNumber, String accountHolder, int balance, String type, String currency, int userId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type = type;
        this.currency = currency;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
