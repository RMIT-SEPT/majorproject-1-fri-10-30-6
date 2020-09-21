package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.TicketDetails;
import org.springframework.data.repository.CrudRepository;

public interface TicketDetailsRepository extends CrudRepository<TicketDetails, Long> {

    TicketDetails findByTicketID(String ticketID);


    @Override
    Iterable<TicketDetails> findAll();





}
