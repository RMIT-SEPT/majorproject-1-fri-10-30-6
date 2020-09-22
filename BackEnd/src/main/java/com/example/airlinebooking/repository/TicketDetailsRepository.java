package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.TicketDetails;
import org.springframework.data.repository.CrudRepository;

public interface TicketDetailsRepository extends CrudRepository<TicketDetails, Long> {

    TicketDetails findByFlightID(String flightID);

    @Override
    Iterable<TicketDetails> findAll();

    TicketDetails findByTicketID(String ticketID);

    TicketDetails findByID(long id);





}
