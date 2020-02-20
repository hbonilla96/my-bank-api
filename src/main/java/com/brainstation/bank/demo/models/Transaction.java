package com.brainstation.bank.demo.models;

public class Transaction {
    private int transactionId;
    private String accountNumber;
    private int idUserCu;
    private String accountCu;
    private String nameCu;
    private Long amountTransfer;
    private String transferDetail;

    public Transaction(int transactionId, String accountNumber, int idUserCu, String accountCu, String nameCu, Long amountTransfer, String transferDetail) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.idUserCu = idUserCu;
        this.accountCu = accountCu;
        this.nameCu = nameCu;
        this.amountTransfer = amountTransfer;
        this.transferDetail = transferDetail;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getIdUserCu() {
        return idUserCu;
    }

    public String getAccountCu() {
        return accountCu;
    }

    public String getNameCu() {
        return nameCu;
    }

    public Long getAmountTransfer() {
        return amountTransfer;
    }

    public String getTransferDetail() {
        return transferDetail;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setIdUserCu(int idUserCu) {
        this.idUserCu = idUserCu;
    }

    public void setAccountCu(String accountCu) {
        this.accountCu = accountCu;
    }

    public void setNameCu(String nameCu) {
        this.nameCu = nameCu;
    }

    public void setAmountTransfer(Long amountTransfer) {
        this.amountTransfer = amountTransfer;
    }

    public void setTransferDetail(String transferDetail) {
        this.transferDetail = transferDetail;
    }
}
