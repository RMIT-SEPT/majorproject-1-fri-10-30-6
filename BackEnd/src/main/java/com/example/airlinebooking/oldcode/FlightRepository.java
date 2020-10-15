package com.example.airlinebooking.oldcode;

import com.example.airlinebooking.oldcode.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {

    Flight findByAirlineID(String airlineid);
    @Override
    Iterable<Flight> findAll();

    Flight findByid(long id);

}
