package flightbooking.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FlightInfo {

    @Id @GeneratedValue
    private Integer id;
    private String airlineID;
    private String airlineName;
    private String location_From;
    private String location_To;
    private String departure;
    private String arrival;
    private int totalSeats;
    private Date createdAt;
    private Date updatedAt;


    public FlightInfo(Integer id, String airlineID, String airlineName, String location_From, String location_To,
                      String departure, String arrival, int totalSeats, Date createdAt, Date updatedAt) {
        this.id = id;
        this.airlineID = airlineID;
        this.airlineName = airlineName;
        this.location_From = location_From;
        this.location_To = location_To;
        this.departure = departure;
        this.arrival = arrival;
        this.totalSeats = totalSeats;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}