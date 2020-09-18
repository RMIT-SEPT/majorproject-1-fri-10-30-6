package com.example.airlinebooking.web;


import com.example.airlinebooking.model.FlightDetails;
import com.example.airlinebooking.services.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flightdetails")
public class flightdetailsController {

    @Autowired
    private FlightDetailsService flightDetailsService;

    @PostMapping("")
    public ResponseEntity<FlightDetails> createNewFlightDetails(@RequestBody FlightDetails flightDetails){
        FlightDetails flightDetails1 = flightDetailsService.saveFlightDetails(flightDetails);

        return new ResponseEntity<FlightDetails>(flightDetails, HttpStatus.CREATED);
    }


}
