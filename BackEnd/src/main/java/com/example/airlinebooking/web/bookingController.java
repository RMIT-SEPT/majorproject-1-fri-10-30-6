package com.example.airlinebooking.web;

import com.example.airlinebooking.model.Bookings;
import com.example.airlinebooking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/booking")
public class bookingController {

    @Autowired
    BookingService bookingService;

    public ResponseEntity<?> createNewBooking(@RequestBody Bookings bookings){
        Bookings bookings1 = bookingService.saveBooking(bookings);


        return new ResponseEntity<Bookings>(bookings1, HttpStatus.CREATED);
    }





}
