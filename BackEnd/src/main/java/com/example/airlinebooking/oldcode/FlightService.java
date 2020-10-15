package com.example.airlinebooking.oldcode;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.oldcode.Flight;
import com.example.airlinebooking.oldcode.FlightRepository;
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
            flight1 = flight;

            return flightRepository.save(flight1);
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

    public Flight findByID(long id){
        Flight flight = flightRepository.findByid(id);

        if (flight == null){
            throw new AccountException("This Flight does not exist");
        } else {
            return flight;
        }
    }

    public void deleteFlight(long id){
        Flight flight = flightRepository.findByid(id);

        if (flight == null){
            throw new AccountException("This Flight does not exist");
        } else {
            flightRepository.delete(flight);
        }
    }

    public Iterable<Flight> getAllFlights(){
        return flightRepository.findAll();
    }


}
