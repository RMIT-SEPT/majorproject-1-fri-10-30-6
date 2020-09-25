package com.example.airlinebooking;

import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.services.FlightService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightTest {
    Flight flight;

    @Autowired
    FlightService flightService = new FlightService();


    @BeforeEach
    public void setup(){
        flight = new Flight("A123","Test Airlines","Melbourne","Sydney","10.30","12.30",400);
    }

    @Test
    public void testVariables(){
        System.out.printf("%s,%s,%s,%s,%d",flight.getAirlineID(),flight.getAirlineName(),flight.getDeparture(),flight.getArrival(),flight.getTotalSeats());

        String expectedResult = "A123";

        assertEquals(expectedResult,flight.getAirlineID());
    }

    @Test
    public void testAddFlight(){

        flightService.saveFlight(flight);

        Flight flight1 = flightService.findByFlightId(flight.getAirlineID());

        assertEquals(flight.getAirlineID(),flight1.getAirlineID());

    }
}
