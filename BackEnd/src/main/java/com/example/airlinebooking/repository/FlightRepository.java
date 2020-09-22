package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {

    Flight findByAirlineID(String airlineid);
    @Override
    Iterable<Flight> findAll();

    Flight findByID(long id);

}
