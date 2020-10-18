package com.example.airlinebooking.web;


import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
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


    @GetMapping("/accountbyusername/{username}")
    public ResponseEntity<?> getAccountbyUsername(@PathVariable String username){

        Account account1 = accountService.findByUsername(username);
        
        return new ResponseEntity<Account>(account1, HttpStatus.FOUND);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editAccount(@PathVariable long id, @RequestBody Account account){
        Account account1 = accountService.editAccount(id,account);

        return new ResponseEntity<Account>(account1,HttpStatus.OK);
    }

    @GetMapping("accountbyid/{id}")
    public ResponseEntity<?> getAccountbyID(@PathVariable long id){
        Account account = accountService.findById(id);

        return new ResponseEntity<Account>(account,HttpStatus.FOUND);
    }

    @GetMapping("/all")
    public Iterable<Account> getAllAccounts(){
        return accountService.findAllAccounts();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable long id){

        accountService.deleteAccountByIdentifier(id);

        return new ResponseEntity<String>("The account was deleted", HttpStatus.OK);

    }

/*    @PutMapping("/{id}")
    public ResponseEntity<?> updateAccount(@PathVariable long id, @ResponseBody Account account){
        Account account1 = accountService.findById(id);
        account1 = account;
        accountService.updateAccount(account1);

        return new ResponseEntity<Account>(account1, HttpStatus.CREATED);
    }*/
    
}
