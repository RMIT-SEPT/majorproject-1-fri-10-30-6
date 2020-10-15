package com.example.airlinebooking.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Please enter a name")
    @Column(unique = true)
    private String username;
    @NotBlank(message = "Please enter a password")
    private String password;
    @NotBlank(message = "Please enter a firstname")
    private String firstname;
    @NotBlank(message = "Please enter a lastname")
    private String lastname;
    @NotBlank(message = "Please enter a email")
    private String email;
    @NotBlank(message = "Please enter a gender")
    private String gender;
    @NotBlank(message = "Please enter a country")
    private String country;

    @NotBlank(message = "Please enter a address")
    private String address;
    @NotBlank(message = "Please enter a phone number")
    @Size(min=10,max =10, message = "Please enter a 10 digit phone number")
    private String phoneNum;

    private Date createdAt;
    private Date updatedAt;


    public Account(String username, String password, String firstname, String lastname, String email, String gender, String country, String address, String phoneNum){
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

    public Account() {

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

     public long getId(){
        return this.id;
     }

     public void setId(long id){
        this.id = id;
     }

}
