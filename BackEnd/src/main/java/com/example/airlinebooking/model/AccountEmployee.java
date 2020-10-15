package com.example.airlinebooking.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AccountEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String firstname;
    private String lastname;
    private String profession;
    private String specialty;
    private String company;


    public AccountEmployee(String username, String firstname, String lastname, String profession, String specialty, String company) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.profession = profession;
        this.specialty = specialty;
        this.company = company;
    }

    public AccountEmployee() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
