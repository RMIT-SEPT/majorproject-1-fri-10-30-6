package com.example.airlinebooking.oldcode;


import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.oldcode.FlightDetails;
import com.example.airlinebooking.oldcode.TicketDetails;
import com.example.airlinebooking.oldcode.FlightDetailsService;
import com.example.airlinebooking.oldcode.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

        if (flightDetails == null){

            throw new AccountException("This Flight does not exist");

        } else {
            TicketDetails ticketDetails1 = ticketService.saveTicket(ticketDetails);
            flightDetails.setSeatsAvailable(flightDetails.getSeatsAvailable() - 1);
            flightDetailsService.saveFlight(flightDetails);
            return new ResponseEntity<TicketDetails>(ticketDetails1, HttpStatus.CREATED);
        }

    }

    @GetMapping("/flightid/{flightid}")
    public ResponseEntity<?> getTicketByFlightId(@PathVariable String flightid){
        TicketDetails ticketDetails1 = ticketService.getTicketsByFlightId(flightid);

        return new ResponseEntity<TicketDetails>(ticketDetails1, HttpStatus.FOUND);
    }


    @GetMapping("/all")
    public Iterable<TicketDetails> getAllTickets(){
        return ticketService.findAllTickets();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTicketById (@PathVariable long id){

        ticketService.deleteTicket(id);

        return new ResponseEntity<String>("Ticket Deleted",HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateTicket(@PathVariable long id, TicketDetails ticketDetails){

        ticketService.updateTicket(id,ticketDetails);

        return new ResponseEntity<String>("Ticket Updated",HttpStatus.OK);

    }

}
