package com.example.airlinebooking.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String airlineID;
    private String airlineName;
    private String location_From;
    private String location_To;
    private String departure;
    private String arrival;
    private int totalSeats;

    private Date createdAt;
    private Date updatedAt;

    public Flight() {

    }
    
    public Flight(String airlineID, String airlineName, String location_From, String location_To, String departure, String arrival, int totalSeats){
        this.airlineID = airlineID;
        this.airlineName = airlineName;
        this.location_From = location_From;
        this.location_To = location_To;
        this.departure = departure;
        this.arrival = arrival;
        this.totalSeats = totalSeats;
    }

    public String getAirlineID() {
        return airlineID;
    }

    public void setAirlineID(String airlineID) {
        this.airlineID = airlineID;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getLocation_From() {
        return location_From;
    }

    public void setLocation_From(String location_From) {
        this.location_From = location_From;
    }

    public String getLocation_To() {
        return location_To;
    }

    public void setLocation_To(String location_To) {
        this.location_To = location_To;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt= new Date();
    }
    @PreUpdate
    protected  void onUpdate(){
        this.updatedAt = new Date();
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

}
