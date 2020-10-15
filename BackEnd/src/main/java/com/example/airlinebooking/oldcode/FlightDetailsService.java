package com.example.airlinebooking.oldcode;


import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.oldcode.FlightDetails;
import com.example.airlinebooking.oldcode.FlightDetailsRepository;
import com.example.airlinebooking.oldcode.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDetailsService {

    @Autowired
    private FlightDetailsRepository flightDetailsRepository;

    @Autowired
    private FlightRepository flightRepository;

    public FlightDetails saveFlight(FlightDetails flightDetails){
        FlightDetails flightDetails1 = flightDetailsRepository.findByid(flightDetails.getId());

        if (flightDetails1 == null){
            flightDetails.setFlightID(flightDetails.getFlightID());
            return flightDetailsRepository.save(flightDetails);
        } else {
            flightDetails1 = flightDetails;

            return flightDetailsRepository.save(flightDetails1);
        }
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
        FlightDetails flightDetails = flightDetailsRepository.findByid(id);

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

        FlightDetails flightDetails = flightDetailsRepository.findByid(id);

        if (flightDetails == null){
            throw new AccountException("This account does not exist");
        } else {
            flightDetailsRepository.delete(flightDetails);
        }

    }




}
