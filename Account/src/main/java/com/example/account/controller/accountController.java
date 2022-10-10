package com.example.account.controller;


import com.example.account.dao.AccountDatabase;
import com.example.account.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class accountController {
    @Autowired
    AccountDatabase accountDatabase;


    @GetMapping("/account")
    public ResponseEntity<List<Account>> getId() {
        try {
            return new ResponseEntity<>(accountDatabase.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable("id") long id) {
        try {
            Account accountObj = getAccountRec(id);

            if (accountObj != null) {
                return new ResponseEntity<>(accountObj, HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @PostMapping("/account")
    public ResponseEntity<Account> newAccount(@RequestBody Account account) {
//        personDatabase.save(person);

        return new ResponseEntity<>(accountDatabase.save(account), HttpStatus.OK);
    }


    @PutMapping("/account/{id}")
    public ResponseEntity<Account> updateTeacher(@PathVariable("id") long id, @RequestBody Account account) {

        Account accountObj = getAccountRec(id);

        if (accountObj != null) {
            accountObj.setAccountType(account.getAccountType());
            accountObj.setAccountNumber(account.getAccountNumber());
            accountObj.setAccountName(account.getAccountName());
            accountObj.setBalance(account.getBalance());
            accountObj.setDate(account.getDate());

            return new ResponseEntity<>(accountDatabase.save(accountObj), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }





    private Account getAccountRec(long id) {
        Optional<Account> accountObj = accountDatabase.findById(id);

        if (accountObj.isPresent()) {
            return accountObj.get();
        }
        return null;
    }



}
