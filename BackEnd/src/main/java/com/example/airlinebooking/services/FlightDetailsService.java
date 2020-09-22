package com.example.airlinebooking.services;


import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Flight;
import com.example.airlinebooking.model.FlightDetails;
import com.example.airlinebooking.repository.FlightDetailsRepository;
import com.example.airlinebooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDetailsService {

    @Autowired
    private FlightDetailsRepository flightDetailsRepository;

    @Autowired
    private FlightRepository flightRepository;

    public FlightDetails saveFlight(FlightDetails flightDetails){
        flightDetails.setFlightID(flightDetails.getFlightID());

        return flightDetailsRepository.save(flightDetails);
    }


    public FlightDetails findFlightbyFlightId (String flightid){
        FlightDetails flightDetails = flightDetailsRepository.findByFlightID(flightid);

        if (flightDetails == null){
            throw new AccountException("This flight does not exist");
        } else {
            return flightDetails;
        }
    }


}