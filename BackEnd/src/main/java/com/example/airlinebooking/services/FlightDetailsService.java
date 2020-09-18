package com.example.airlinebooking.services;

import com.example.airlinebooking.model.FlightDetails;
import com.example.airlinebooking.repository.FlightDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDetailsService {

    @Autowired
    private FlightDetailsRepository flightDetailsRepository;

    public FlightDetails saveFlightDetails(FlightDetails flightDetails){
        flightDetails.setFlightID(flightDetails.getFlightID().toUpperCase());

        return flightDetailsRepository.save(flightDetails);
    }
}
