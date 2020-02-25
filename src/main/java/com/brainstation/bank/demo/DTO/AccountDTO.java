package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.models.Account;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class AccountDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "account_holder")
    private String accountHolder;
    @Column(name = "balance")
    private int balance;
    @Column(name = "type")
    private String type;
    @Column(name = "currency")
    private String currency;
    @Column(name = "user_id")
    private int userId;

    public AccountDTO(){

    }

    public AccountDTO(String accountNumber, String accountHolder, int balance, String type, String currency, int userId) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type = type;
        this.currency = currency;
        this.userId = userId;
    }

    public AccountDTO(Account account){
        this.id = account.getId();
        this.accountNumber = account.getAccountNumber();
        this.accountHolder = account.getAccountHolder();
        this.balance = account.getBalance();
        this.type = account.getType();
        this.currency = account.getCurrency();
        this.userId = account.getUserId();
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
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

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
