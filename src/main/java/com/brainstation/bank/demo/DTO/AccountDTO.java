package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.enums.AccountTypes;
import com.brainstation.bank.demo.models.Account;
import com.brainstation.bank.demo.models.User;

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
    @Column(name = "type")
    private AccountTypes type;
    @Column(name = "currency")
    private String currency;
    @Column(name = "amount")
    private String amount;
    @Column(name = "user_id")
    private int userId;

    public AccountDTO(Account account){
        this.id = account.getId();
        this.accountNumber = account.getAccountNumber();
        this.type = account.getType();
        this.currency = account.getCurrency();
        this.amount = account.getAmount();
        this.userId = account.getUserId();
    }
}
