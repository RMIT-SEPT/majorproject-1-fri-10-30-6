package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.TicketDetails;
import com.example.airlinebooking.repository.TicketDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketDetailsRepository ticketDetailsRepository;


    public TicketDetails saveTicket(TicketDetails ticketDetails){
        ticketDetails.setFlightID(ticketDetails.getFlightID());

        return ticketDetailsRepository.save(ticketDetails);
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
        TicketDetails ticketDetails = ticketDetailsRepository.findByID(id);
        if (ticketDetails == null){
            throw new AccountException("Ticket Does Not Exist!");
        } else {
            return ticketDetails;
        }
    }

    public void deleteTicket(long id){
        TicketDetails ticketDetails = ticketDetailsRepository.findByID(id);

        if (ticketDetails == null){
            throw new AccountException("Ticket Does Not Exist!");
        } else {
            ticketDetailsRepository.delete(ticketDetails);
        }

    }


}
