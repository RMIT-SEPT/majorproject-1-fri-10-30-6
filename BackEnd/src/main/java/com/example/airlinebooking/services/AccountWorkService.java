package com.example.airlinebooking.services;

import com.example.airlinebooking.model.AccountWork;
import com.example.airlinebooking.repository.AccountWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountWorkService {
    @Autowired
    AccountWorkRepository accountWorkRepository;

    public AccountWork createNewAccount(AccountWork accountWork){
        AccountWork accountWork1 = accountWorkRepository.findById(accountWork.getId());
    }
}
