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

    @GetMapping("/flightid/{flightid}")
    public ResponseEntity<?> findbyFlightId(@PathVariable String flightid){
        FlightDetails flightDetails = flightDetailsService.findFlightbyFlightId(flightid);

        return new ResponseEntity<FlightDetails>(flightDetails,HttpStatus.FOUND);
    }

    @GetMapping("/dataid/{id}")
    public ResponseEntity<?> findByID(@PathVariable long id){
        FlightDetails flightDetails = flightDetailsService.findFlightbyId(id);

        return new ResponseEntity<FlightDetails>(flightDetails,HttpStatus.FOUND);
    }

    @GetMapping("/all")
    public Iterable<?> findALlFlightDetails(){
        return flightDetailsService.findAllFlightDetails();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFlightDetails(@PathVariable long id){
        flightDetailsService.deleteFlight(id);

        return new ResponseEntity<String>("Flight Details deleted", HttpStatus.OK);
    }



}
