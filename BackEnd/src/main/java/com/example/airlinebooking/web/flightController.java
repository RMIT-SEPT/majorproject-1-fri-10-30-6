package com.example.airlinebooking.web;

import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flight")
public class flightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("")
    public ResponseEntity<Flight> createNewFlight(@RequestBody Flight flight){
        Flight flight1 = flightService.saveFlight(flight);


        return new ResponseEntity<Flight>(flight1, HttpStatus.CREATED);
    }

    @GetMapping("/{flightid}")
    public ResponseEntity<?> findFlightbyFlightID(@PathVariable String flightid){
        Flight flight1 = flightService.findByFlightId(flightid);

        return new ResponseEntity<Flight>(flight1, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findFlightByID(@PathVariable long id){
        Flight flight1 = flightService.findByID(id);

        return new ResponseEntity<Flight>(flight1,HttpStatus.FOUND);

    }

    @GetMapping("/all")
    public Iterable<?> getAllFlights(){
        return flightService.getAllFlights();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFlight(@PathVariable long id){

        flightService.deleteFlight(id);

        return new ResponseEntity<String>("This Flight is deleted", HttpStatus.OK);
    }
}
