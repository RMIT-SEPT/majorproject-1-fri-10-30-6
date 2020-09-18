package com.example.airlinebooking.web;

import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flight")
public class flightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("")
    public ResponseEntity<Flight> createNewFlight(@RequestBody Flight flight){
        Flight flight1 = flightService.saveFlight(flight);


        return new ResponseEntity<Flight>(flight, HttpStatus.CREATED);
    }
}
