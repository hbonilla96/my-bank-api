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

    public AccountDTO(Account account){
        this.id = account.getId();
        this.accountNumber = account.getAccountNumber();
        this.accountHolder = account.getAccountHolder();
        this.balance = account.getBalance();
        this.type = account.getType();
        this.currency = account.getCurrency();
        this.userId = account.getUserId();
    }
}
