package com.example.airlinebooking.web;


import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.model.FlightDetails;
import com.example.airlinebooking.model.TicketDetails;
import com.example.airlinebooking.services.FlightDetailsService;
import com.example.airlinebooking.services.FlightService;
import com.example.airlinebooking.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.ResolutionSyntax;
import javax.security.auth.callback.TextInputCallback;

@RestController
@RequestMapping("/api/ticketdetails")
public class ticketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private FlightDetailsService flightDetailsService;


    @PostMapping("")
    public ResponseEntity<TicketDetails> createNewTicket(@RequestBody TicketDetails ticketDetails){

        FlightDetails flightDetails = flightDetailsService.findFlightbyFlightId(ticketDetails.getFlightID());
//
//        TicketDetails ticketDetails1 = ticketService.saveTicket(ticketDetails);
//        flightDetails.setSeatsAvailable(flightDetails.getSeatsAvailable() - 1);
//        return new ResponseEntity<TicketDetails>(ticketDetails1, HttpStatus.CREATED);

        if (flightDetails == null){

            throw new AccountException("This Flight does not exist");

        } else {
            TicketDetails ticketDetails1 = ticketService.saveTicket(ticketDetails);
            flightDetails.setSeatsAvailable(flightDetails.getSeatsAvailable() - 1);
            return new ResponseEntity<TicketDetails>(ticketDetails1, HttpStatus.CREATED);
        }

    }

    @GetMapping("/{flightid}")
    public ResponseEntity<?> getTicketByFlightId(@RequestBody String flightid){
        TicketDetails ticketDetails1 = ticketService.getTicketsByFlightId(flightid);

        return new ResponseEntity<TicketDetails>(ticketDetails1, HttpStatus.FOUND);
    }

//    @GetMapping("/{flightid}")
//    public ResponseEntity<?> getTicketByFlightId (@RequestBody String flightid){
//
//    }

    @GetMapping("/all")
    public Iterable<TicketDetails> getAllTickets(){
        return ticketService.findAllTickets();
    }

//    @DeleteMapping("{ticketid}")
//    public ResponseEntity<?> deleteTicketById (@RequestBody String id){
//
//
//    }


}
