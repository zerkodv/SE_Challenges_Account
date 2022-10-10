package com.example.account.model;

import java.util.Date;

public class Account {
    private Long id;
    private String accountType;
    private String accountNumber;
    private String accountName;
    private Integer balance;
    private Date date;

    public Account(Long id, String accountType, String accountNumber, String accountName, Integer balance, Date date) {
        this.id = id;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountType='" + accountType + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
