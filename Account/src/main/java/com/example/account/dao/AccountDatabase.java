package com.example.account.dao;

import com.example.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDatabase extends JpaRepository<Account, Long> {

}
