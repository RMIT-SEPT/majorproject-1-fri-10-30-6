package com.example.airlinebooking.model;

import javax.persistence.*;

@Entity
public class AccountWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long company;
    private String Username;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Profession;
    private String Specialty;

    public AccountWork(String firstName, String lastName, String profession, String specialty, String username, String password) {
        FirstName = firstName;
        LastName = lastName;
        Profession = profession;
        Specialty = specialty;
        this.Username = username;
        this.Password = password;
    }

    public AccountWork() {

    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String specialty) {
        Specialty = specialty;
    }


    public void setId(long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

