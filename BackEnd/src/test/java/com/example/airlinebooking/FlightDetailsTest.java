package com.example.airlinebooking;

import com.example.airlinebooking.oldcode.FlightDetails;
import com.example.airlinebooking.oldcode.FlightDetailsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightDetailsTest {

    FlightDetails flightDetails;

    @Autowired
    FlightDetailsService flightDetailsService;

    @BeforeEach
    public void setup(){
        flightDetails = new FlightDetails("A123","26/09/2020",450.00,400);
    }

    @Test
    public void testAddFlightDetails(){
        flightDetailsService.saveFlight(flightDetails);

        FlightDetails flightDetails1 = flightDetailsService.findFlightbyFlightId(flightDetails.getFlightID());

        assertEquals(flightDetails.getFlightID(),flightDetails1.getFlightID());
    }





}
