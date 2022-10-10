package com.example.account.controller;


import com.example.account.dao.AccountDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class accountController {
    @Autowired
    AccountDatabase accountDatabase;

    
}
