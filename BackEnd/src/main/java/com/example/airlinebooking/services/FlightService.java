package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public Flight saveFlight(Flight flight){

        Flight flight1 = flightRepository.findByAirlineID(flight.getAirlineID());

        if (flight1 == null){
            flight.setAirlineID(flight.getAirlineID().toUpperCase());

            return flightRepository.save(flight);
        } else {
            throw new AccountException("Flight already Exists");
        }

    }

    public Flight findByFlightId(String airlineid){

        Flight flight = flightRepository.findByAirlineID(airlineid);

        if (flight == null){
            throw new AccountException("Airline Does not exist");
        } else {
            return flight;
        }

    }
}