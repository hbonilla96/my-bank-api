package com.brainstation.bank.demo.models;

public class MonthsExpenses {
    private String january;
    private String february;
    private String march;
    private String april;
    private String may;
    private String june;

    public MonthsExpenses(){}

    public MonthsExpenses(String january, String february, String march, String april, String may, String june) {
        this.january = january;
        this.february = february;
        this.march = march;
        this.april = april;
        this.may = may;
        this.june = june;
    }

    public String getJanuary() {
        return january;
    }

    public String getFebruary() {
        return february;
    }

    public String getMarch() {
        return march;
    }

    public String getApril() {
        return april;
    }

    public String getMay() {
        return may;
    }

    public String getJune() {
        return june;
    }

    public void setJanuary(String january) {
        this.january = january;
    }

    public void setFebruary(String february) {
        this.february = february;
    }

    public void setMarch(String march) {
        this.march = march;
    }

    public void setApril(String april) {
        this.april = april;
    }

    public void setMay(String may) {
        this.may = may;
    }

    public void setJune(String june) {
        this.june = june;
    }
}
