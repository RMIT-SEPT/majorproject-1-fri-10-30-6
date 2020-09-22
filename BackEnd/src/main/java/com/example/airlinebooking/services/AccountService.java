package com.example.airlinebooking.services;

import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountrepository;

    public Account saveORupdateAccount(Account account){

        return accountrepository.save(account);
    }
}
