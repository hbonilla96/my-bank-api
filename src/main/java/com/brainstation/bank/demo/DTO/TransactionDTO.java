package com.brainstation.bank.demo.DTO;

import javax.persistence.*;
import com.brainstation.bank.demo.models.Transaction;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@CrossOrigin
@Table(name ="transaction")
public class TransactionDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private int id;
    @Column(name="account_id")
    private int accountId;
    @Column(name = "user_id_cu")
    private int userIdCu;
    @Column(name = "account_cu")
    private String accountCu;
    @Column(name = "name_cu")
    private String nameCu;
    @Column(name = "amount")
    private int amount;
    @Column(name = "transfer_detail")
    private String transferDetail;

    public TransactionDTO(){

    }

    public TransactionDTO(Transaction transaction){
        this.id = transaction.getId();
        this.accountCu = transaction.getAccountCu();
        this.userIdCu = transaction.getUserIdCu();
        this.accountId = transaction.getAccountId();
        this.nameCu = transaction.getNameCu();
        this.transferDetail = transaction.getTransferDetail();
    }
}
