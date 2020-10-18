package com.example.airlinebooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class TimeSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long WorkersId;
    private String StartTime;
    private String EndTime;
    private String mon;
    private String tue;
    private String wed;
    private String thur;
    private String fri;
    private String avail;

    public TimeSlot(long workersId, String mon,  String tue,  String wed,  String thur,  String fri, String startTime, String endTime, String avail) {
        this.mon = mon;
        this.tue = tue;
        this.wed = wed;
        this.thur = thur;
        this.fri = fri;
        this.WorkersId = workersId;
        this.StartTime = startTime;
        this.EndTime = endTime;
        this.avail = avail;
    }

    public TimeSlot() {

    }



    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }


    public String getTue() {
        return tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }



    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getThur() {
        return thur;
    }

    public void setThur(String thur) {
        this.thur = thur;
    }


    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {
        return id;
    }

    public long getWorkersId() {
        return WorkersId;
    }

    public void setWorkersId(long workersId) {
        WorkersId = workersId;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }
}
