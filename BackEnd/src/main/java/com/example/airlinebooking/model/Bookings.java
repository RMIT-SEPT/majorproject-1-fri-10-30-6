package com.example.airlinebooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Bookings {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private long userID;
    private long workerID;
    private Date date;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getWorkerID() {
        return workerID;
    }

    public void setWorkerID(long workerID) {
        this.workerID = workerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
