package com.example.airlinebooking.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message="Username is required")
    private String username;
    private String password;
    @NotBlank(message="First Name is required")
    private String firstname;
    @NotBlank(message="Last Name is required")
    private String lastname;
    @NotBlank(message="Email is required")
    private String email;
    private String gender;
    @NotBlank(message="Country is required")
    private String country;
    @NotBlank(message="Address is required")
    private String address;
    @NotBlank(message="Phone Number is required")
    private String phoneNum;

    private Date createdAt;
    private Date updatedAt;



    public Account() {

    }

    public Account(long id, String username, String password, String firstname, String lastname, String email, String gender, String country, String address, String phoneNum) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.country = country;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt= new Date();
    }
     @PreUpdate
    protected  void onUpdate(){
        this.updatedAt = new Date();
     }


}
