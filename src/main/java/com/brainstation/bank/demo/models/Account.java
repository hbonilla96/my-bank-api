package com.brainstation.bank.demo.models;

import com.brainstation.bank.demo.enums.AccountTypes;

public class Account {
    private int id;
    private String accountNumber;
    private AccountTypes type;
    private String currency;
    private String amount;
    private int userId;

    public Account(int id, String accountNumber, AccountTypes type, String currency, String amount, int userId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountTypes getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
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

    public void setType(AccountTypes type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
