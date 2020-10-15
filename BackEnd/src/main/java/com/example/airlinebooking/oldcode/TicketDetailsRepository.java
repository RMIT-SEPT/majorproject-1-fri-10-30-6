package com.example.airlinebooking.oldcode;

import com.example.airlinebooking.oldcode.TicketDetails;
import org.springframework.data.repository.CrudRepository;

public interface TicketDetailsRepository extends CrudRepository<TicketDetails, Long> {

    TicketDetails findByFlightID(String flightID);

    @Override
    Iterable<TicketDetails> findAll();

    TicketDetails findByTicketID(String ticketID);

    TicketDetails findByid(long id);

}
