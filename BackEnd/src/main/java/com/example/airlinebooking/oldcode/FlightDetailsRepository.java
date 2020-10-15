package com.example.airlinebooking.oldcode;

import com.example.airlinebooking.oldcode.FlightDetails;
import org.springframework.data.repository.CrudRepository;

public interface FlightDetailsRepository extends CrudRepository<FlightDetails, Long> {

    FlightDetails findByFlightID (String flightid);

    @Override
    Iterable<FlightDetails> findAll();

    FlightDetails findByid(long id);


}
