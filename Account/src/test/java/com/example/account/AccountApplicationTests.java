package com.example.account;

import com.example.account.controller.AccountController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AccountApplicationTests {

    @Autowired
    AccountController accountController;

    @Test
    void contextLoads() {
        Assertions.assertAll((Executable) accountController);
    }

}
