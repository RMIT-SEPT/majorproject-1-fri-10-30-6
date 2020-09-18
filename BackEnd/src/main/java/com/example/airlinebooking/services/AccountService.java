package com.example.airlinebooking.services;

import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account){

        account.setUsername(account.getUsername());
        return accountRepository.save(account);
    }

}
