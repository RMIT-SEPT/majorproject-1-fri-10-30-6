package com.example.airlinebooking.web;



import com.example.airlinebooking.model.FlightDetails;
import com.example.airlinebooking.services.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flightdetails")
public class flightdetailsController {

    @Autowired
    private FlightDetailsService flightDetailsService;

    @PostMapping("")
    public ResponseEntity<?> createNewFlightDetail(@RequestBody FlightDetails flightDetails){
        FlightDetails flightDetails1 = flightDetailsService.saveFlight(flightDetails);


        return new ResponseEntity<FlightDetails>(flightDetails1, HttpStatus.CREATED);
    }

    @GetMapping("/{flightid}")
    public ResponseEntity<?> findbyFlightId(@RequestBody String flightid){
        FlightDetails flightDetails = flightDetailsService.findFlightbyFlightId(flightid);

        return new ResponseEntity<FlightDetails>(flightDetails,HttpStatus.FOUND);
    }
}
