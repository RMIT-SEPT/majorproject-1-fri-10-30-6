package com.example.airlinebooking.services;


import com.example.airlinebooking.exceptions.AccountException;
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

    public FlightDetails findFlightbyId (long id){
        FlightDetails flightDetails = flightDetailsRepository.findByID(id);

        if (flightDetails == null){
            throw new AccountException("This flight does not exist!");
        } else {
            return flightDetails;
        }
    }

    public Iterable<FlightDetails> findAllFlightDetails(){
        return flightDetailsRepository.findAll();
    }

    public void deleteFlight(long id){

        FlightDetails flightDetails = flightDetailsRepository.findByID(id);

        if (flightDetails == null){
            throw new AccountException("This account does not exist");
        } else {
            flightDetailsRepository.delete(flightDetails);
        }

    }




}
