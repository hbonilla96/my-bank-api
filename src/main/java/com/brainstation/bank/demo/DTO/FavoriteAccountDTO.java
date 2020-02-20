package com.brainstation.bank.demo.DTO;

import com.brainstation.bank.demo.models.FavoriteAccount;

import javax.persistence.*;

@Entity
@Table(name = "favorite_account")
public class FavoriteAccountDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "account_holder")
    private String accountHolder;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "bank")
    private String bank;
    @Column(name = "user_id")
    private int userId;

    public FavoriteAccountDTO(){}

    public FavoriteAccountDTO(FavoriteAccount favoriteAccount){
        this.id = favoriteAccount.getId();
        this.idNumber = favoriteAccount.getIdNumber();
        this.accountHolder = favoriteAccount.getAccountHolder();
        this.accountNumber = favoriteAccount.getAccountNumber();
        this.bank = favoriteAccount.getBank();
        this.userId = favoriteAccount.getUserId();
    }
}
