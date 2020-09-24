package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.PropertyVetoException;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account){


        try{
            account.setUsername(account.getUsername());
            return accountRepository.save(account);
        } catch (Exception e){
            throw new AccountException("This account already exists ");
        }

    }



    public Account findByUsername(String username){

        Account account = accountRepository.findByUsername(username);

        if (account == null){
            throw new AccountException("Account does not exist!");
        } else {
            return account;
        }

    }

    public Iterable<Account> findAllAccounts(){
        return accountRepository.findAll();
    }


    public void deleteAccountByIdentifier(String username){
        Account account = accountRepository.findByUsername(username);

        if (account == null){
            throw new AccountException("Account does not exist!");
        } else {
            accountRepository.delete(account);
        }


    }

    public Account findById(long id){
        Account account = accountRepository.findByid(id);

        if (account == null){
            throw new AccountException("Account Does Not Exist!");
        } else {
            return account;
        }
    }

}
