package com.example.airlinebooking.oldcode;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.oldcode.TicketDetails;
import com.example.airlinebooking.oldcode.FlightDetailsRepository;
import com.example.airlinebooking.oldcode.TicketDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketDetailsRepository ticketDetailsRepository;

    @Autowired
    private FlightDetailsRepository flightDetailsRepository;


    public TicketDetails saveTicket(TicketDetails ticketDetails){
        TicketDetails ticketDetails1 = ticketDetailsRepository.findByid(ticketDetails.getId());

        if (ticketDetails == null){
            ticketDetails.setFlightID(ticketDetails.getFlightID());

            return ticketDetailsRepository.save(ticketDetails);
        } else {
            ticketDetails1 = ticketDetails;

            return ticketDetailsRepository.save(ticketDetails1);
        }


    }


    public TicketDetails getTicketsByFlightId(String flightid){
        TicketDetails ticketDetails = ticketDetailsRepository.findByFlightID(flightid);

        if (ticketDetails == null){
            throw new AccountException("Ticket Does Not Exist!");
        } else {
            return ticketDetails;
        }
    }

    public Iterable<TicketDetails> findAllTickets(){
        return ticketDetailsRepository.findAll();
    }

    public TicketDetails findTicketByID(String ticketID){
        TicketDetails ticketDetails = ticketDetailsRepository.findByTicketID(ticketID);

        if (ticketDetails == null){
            throw new AccountException("Ticket Does Not Exist!");
        } else {
            return ticketDetails;
        }
    }

    public TicketDetails findTicketByUniqueID(long id){
        TicketDetails ticketDetails = ticketDetailsRepository.findByid(id);
        if (ticketDetails == null){
            throw new AccountException("Ticket Does Not Exist!");
        } else {
            return ticketDetails;
        }
    }

    public void deleteTicket(long id){
        TicketDetails ticketDetails = ticketDetailsRepository.findByid(id);

        if (ticketDetails == null){
            throw new AccountException("Ticket Does Not Exist!");
        } else {
            ticketDetailsRepository.delete(ticketDetails);
        }

    }

    public TicketDetails updateTicket(long id, TicketDetails ticketDetails){
        TicketDetails ticketDetails1 = ticketDetailsRepository.findByid(id);
        return ticketDetails1 = ticketDetailsRepository.save(ticketDetails);
    }




}