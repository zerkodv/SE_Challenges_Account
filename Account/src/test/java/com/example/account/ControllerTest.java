package com.example.account;

import com.example.account.controller.AccountController;
import com.example.account.dao.AccountDatabase;
import com.example.account.model.Account;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Array.get;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AccountController.class)
public class ControllerTest {

    @MockBean
    AccountDatabase accountDatabase;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testfindAll() throws Exception {
        Account account = new Account(03L,"Loan","23456789","Johns Smith", "300", "2022-10-10");
        List<Account> accounts = Arrays.asList(account);



        Mockito.when(accountDatabase.findAll()).thenReturn(accounts);

        mockMvc.perform(get("/persons"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$", Matchers.hasSize(1)))
                .andExpect((ResultMatcher) jsonPath("$[0].name", Matchers.is("John Book")));
    }

    private RequestBuilder get(String s) {
        return null;
    }


    @Test
    public void testDeleteAll() throws Exception{

    }



}