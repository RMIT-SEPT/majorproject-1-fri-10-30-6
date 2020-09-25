package com.example.airlinebooking;

import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.services.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AccountTest {
    Account account;

    @Autowired
    AccountService accountService = new AccountService();

    @BeforeEach
    public void SetUp(){
        account = new Account("Test","Password","Firstname","Lastname","email@email.com",
                "Non","Australia","Address","04303030303");
    }

    @Test
    public void testItems(){
        System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s,%s",account.getUsername(),account.getPassword(),account.getFirstname(),account.getLastname()
        , account.getAddress(), account.getCountry(), account.getGender(), account.getEmail(), account.getPhoneNum());

        String expectedResult = "Test";

        assertEquals(expectedResult,account.getUsername());
    }

    @Test
    public void addToDatabase(){
        accountService.saveAccount(account);

        Account account1 = accountService.findByUsername(account.getUsername());

        assertEquals(account.getUsername(), account1.getUsername());
    }

    @Test
    public void testGetID(){
        accountService.saveAccount(account);
        Account account1 = accountService.findById(account.getId());

        assertEquals(account.getUsername(), account1.getUsername());
    }

    @Test
    public void testDeleteAccount(){
        accountService.deleteAccountByIdentifier(account.getUsername());

//        Account account1 = accountService.findByUsername(account.getUsername());


    }


}
