package com.example.airlinebooking;

import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.repository.AccountRepository;
import com.example.airlinebooking.services.AccountService;
import com.example.airlinebooking.services.FlightService;
import com.example.airlinebooking.web.accountController;
import com.example.airlinebooking.web.flightController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.channels.AcceptPendingException;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class TestJUnit {
    Account account = new Account("Test","Password","Firstname","Lastname","email@email.com","Non","Australia","Address","04303030303");
    Flight flight = new Flight();

    @Autowired
    AccountService accountService = new AccountService();

    @Autowired
    FlightService flightService = new FlightService();




    @BeforeEach
    public void init(){
    flight.setAirlineID("A123");
    flight.setAirlineName("TestLine");
    flight.setDeparture("Melbourne");
    flight.setArrival("Sydney");
    flight.setTotalSeats(200);
    }


    @Test
    public void testAccountDetails(){
//        System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s,%s",account.getUsername(),account.getPassword(),account.getFirstname(),account.getLastname()
//        , account.getAddress(), account.getCountry(), account.getGender(), account.getEmail(), account.getPhoneNum());
//
//        String expectedResult = "Firstname";
//        assertEquals(expectedResult,account.getFirstname());
    }

    @Test
    public void testFlightDetails(){
        System.out.printf("%s,%s,%s,%s,%d",flight.getAirlineID(),flight.getAirlineName(),flight.getDeparture(),flight.getArrival(),flight.getTotalSeats());

        String expectedResult = "A123";

        assertEquals(expectedResult,flight.getAirlineID());

    }


    @Test
    public void testAccountAdd(){
        accountService.saveAccount(account);
        System.out.println(accountService.findAllAccounts());
    }

    @Test
    public void testFlightAdd(){
        flightService.saveFlight(flight);
    }



}
