package com.example.airlinebooking.services;

import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public Flight saveFlight(Flight flight){
        flight.setAirlineID(flight.getAirlineID().toUpperCase());

        return flightRepository.save(flight);
    }
}
