package com.example.airlinebooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ticketId;
    private String planeId;
    private String userName;
    private int cardnumber;
    private String cardtype;
    private String expireMonth;
    private String expireDate;

    public Payment(long id, String userName, int cardnumber, String cardtype, String expireMonth, String expireDate) {
        this.id = id;
        this.userName = userName;
        this.cardnumber = cardnumber;
        this.cardtype = cardtype;
        this.expireMonth = expireMonth;
        this.expireDate=expireDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getTicketId(){
        return this.ticketId;
    }

    public void setTicketId(String ticketId){
        this.ticketId = ticketId;
    }

    public String getPlaneId(){return this.planeId;}

    public void setPlaneId(String planeId) {this.planeId = planeId;}

    public Payment() {

    }
}
