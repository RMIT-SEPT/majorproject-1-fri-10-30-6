package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.FlightDetails;
import org.springframework.data.repository.CrudRepository;

public interface FlightDetailsRepository extends CrudRepository <FlightDetails,Long> {

    FlightDetails findByFlightID (String FlightID);

    @Override
    Iterable<FlightDetails> findAll();
}
