package com.example.airlinebooking.oldcode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String flightID;
    private String flightDepartureDate;
    private double price;
    private int seatsAvailable;


    public FlightDetails(String flightID, String flightDepartureDate, double price, int seatsAvailable) {
        this.flightID = flightID;
        this.flightDepartureDate = flightDepartureDate;
        this.price = price;
        this.seatsAvailable = seatsAvailable;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFlightDepartureDate() {
        return flightDepartureDate;
    }

    public void setFlightDepartureDate(String flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }


    public FlightDetails(){

    }

}
