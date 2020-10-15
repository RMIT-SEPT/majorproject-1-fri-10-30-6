package com.example.airlinebooking.oldcode;


//import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TicketDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ticketID;
    private String PassportNumber;
    private String fullName;
    private String flightID;
    private String departureDate;
    private String status;

    public TicketDetails(String ticketID, String passportNumber, String fullName, String flightID, String departureDate, String status) {
        this.ticketID = ticketID;
        this.PassportNumber = passportNumber;
        this.fullName = fullName;
        this.flightID = flightID;
        this.departureDate = departureDate;
        this.status = status;
    }

    public String getTicketID(){
        return this.ticketID;
    }


    public void setTicketID(String ticketID){
        this.ticketID = ticketID;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        PassportNumber = passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TicketDetails() {

    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }
}
