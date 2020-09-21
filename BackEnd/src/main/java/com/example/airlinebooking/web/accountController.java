package com.example.airlinebooking.web;


import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class accountController {

    @Autowired
    private AccountService accountService;


    @PostMapping("")
    public ResponseEntity<?> createNewAccount(@RequestBody Account account){
        Account account1 = accountService.saveAccount(account);

        return new ResponseEntity<Account>(account1, HttpStatus.CREATED);
    }


    @GetMapping("{username}")
    public ResponseEntity<?> getAccountbyId (@PathVariable String username){

        Account account1 = accountService.findByUsername(username);
        
        return new ResponseEntity<Account>(account1, HttpStatus.FOUND);

    }

}
