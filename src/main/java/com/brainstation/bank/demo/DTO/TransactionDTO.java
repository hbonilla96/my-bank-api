package com.brainstation.bank.demo.DTO;

import javax.persistence.*;
import com.brainstation.bank.demo.models.Transaction;

@Entity
@Table(name ="transaction")
public class TransactionDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private int transactionId;
    @Column(name = "origin_account")
    private String originAccount;
    @Column(name = "destination_account")
    private String destinationAccount;
    @Column(name = "currency")
    private String currency;
    @Column(name = "transfer_amount")
    private int transferAmount;
    @Column(name = "transfer_detail")
    private String transferDetail;
    @Column(name = "user_id")
    private String userId;

    public TransactionDTO(){

    }

    public TransactionDTO(Transaction transaction){
        this.transactionId = transaction.getTransactionId();
        this.originAccount = transaction.getOriginAccount();
        this.destinationAccount = transaction.getDestinationAccount();
        this.currency = transaction.getCurrency();
        this.transferAmount = transaction.getTransferAmount();
        this.transferDetail = transaction.getTransferDetail();
    }
}
