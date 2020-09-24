package com.example.airlinebooking;

import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.services.AccountService;
import com.example.airlinebooking.services.FlightService;
import com.example.airlinebooking.web.accountController;
import com.example.airlinebooking.web.flightController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestJUnit {
    Account account = new Account();
    Flight flight = new Flight();
    AccountService accountService = new AccountService();
    FlightService flightService = new FlightService();




    @BeforeEach
    public void init(){
        account.setUsername("Test");
        account.setPassword("passwordTest");
        account.setFirstname("Firstname");
        account.setLastname("Lastname");
        account.setAddress("Address");
        account.setCountry("Country");
        account.setGender("Gender");
        account.setEmail("test@mail.com");
        account.setPhoneNum("040202020202");

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
        accountService.findAllAccounts();
    }

    @Test
    public void testFlightAdd(){
        flightService.saveFlight(flight);
    }



}
