package com.example.airlinebooking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class AdminAccount {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String Username;
    private String Password;
    private String Firstname;
    private String Lastname;
    private String email;


    public AdminAccount(String username, String password, String firstname, String lastname, String email) {
        Username = username;
        Password = password;
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
    }

    public AdminAccount() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
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

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
