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
    @Column(name="account_number")
    private String accountNumber;
    @Column(name = "id_user_cu")
    private int userIdCu;
    @Column(name = "account_cu")
    private String accountCu;
    @Column(name = "name_cu")
    private String nameCu;
    @Column(name = "amount_transfer")
    private Long amountTransfer;
    @Column(name = "transfer_detail")
    private String transferDetail;

    public TransactionDTO(){

    }

    public TransactionDTO(Transaction transaction){
        this.transactionId = transaction.getTransactionId();
        this.accountNumber = transaction.getAccountNumber();
        this.userIdCu = transaction.getIdUserCu();
        this.accountCu = transaction.getAccountCu();
        this.nameCu = transaction.getNameCu();
        this.amountTransfer = transaction.getAmountTransfer();
        this.transferDetail = transaction.getTransferDetail();
    }
}
