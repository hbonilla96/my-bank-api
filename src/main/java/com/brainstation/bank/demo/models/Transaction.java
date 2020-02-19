package com.brainstation.bank.demo.models;

public class Transaction {
    private int id;
    private int accountId;
    private int userIdCu;
    private String accountCu;
    private String nameCu;
    private int amount;
    private String transferDetail;

    public Transaction(int id, int accountId, int userIdCu, String accountCu, String nameCu, int amount, String transferDetail) {
        this.id = id;
        this.accountId = accountId;
        this.userIdCu = userIdCu;
        this.accountCu = accountCu;
        this.nameCu = nameCu;
        this.amount = amount;
        this.transferDetail = transferDetail;
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getUserIdCu() {
        return userIdCu;
    }

    public String getAccountCu() {
        return accountCu;
    }

    public String getNameCu() {
        return nameCu;
    }

    public int getAmount() {
        return amount;
    }

    public String getTransferDetail() {
        return transferDetail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setUserIdCu(int userIdCu) {
        this.userIdCu = userIdCu;
    }

    public void setAccountCu(String accountCu) {
        this.accountCu = accountCu;
    }

    public void setNameCu(String nameCu) {
        this.nameCu = nameCu;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTransferDetail(String transferDetail) {
        this.transferDetail = transferDetail;
    }
}
