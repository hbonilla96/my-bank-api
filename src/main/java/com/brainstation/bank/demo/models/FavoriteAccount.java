package com.brainstation.bank.demo.models;

public class FavoriteAccount {

    private int id;
    private String idNumber;
    private String accountHolder;
    private String accountNumber;
    private String bank;
    private int userId;

    public FavoriteAccount(int id, String idNumber, String accountHolder, String accountNumber, String bank, int userId) {
        this.id = id;
        this.idNumber = idNumber;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
