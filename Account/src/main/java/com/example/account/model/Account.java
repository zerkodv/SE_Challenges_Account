package com.example.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accounttype;
    private String accountnumber;
    private String accountname;
    private String balance;
    private String currentdate;

    public Account(Long id, String accounttype, String accountnumber, String accountname, String balance, String currentdate) {
        this.id = id;
        this.accounttype = accounttype;
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        this.balance = balance;
        this.currentdate = currentdate;
    }

    public Account() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(String currentdate) {
        this.currentdate = currentdate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accounttype='" + accounttype + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", accountname='" + accountname + '\'' +
                ", balance='" + balance + '\'' +
                ", currentdate='" + currentdate + '\'' +
                '}';
    }
}
