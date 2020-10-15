package com.example.airlinebooking.web;

import com.example.airlinebooking.model.Bookings;
import com.example.airlinebooking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/booking")
public class bookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping("")
    public ResponseEntity<?> createNewBooking(@RequestBody Bookings bookings){
        Bookings bookings1 = bookingService.saveBooking(bookings);
        return new ResponseEntity<Bookings>(bookings1, HttpStatus.CREATED);
    }


    @GetMapping("/user/{id}/")
    public ResponseEntity<?> findBookingByUserID(@PathVariable long id){
        Bookings bookings = bookingService.findByUserId(id);

        return new ResponseEntity<Bookings>(bookings,HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable long id){

        bookingService.deleteBooking(id);

        return new ResponseEntity<String>("Booking is deleted",HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Bookings> getAll(){
        return bookingService.getAll();
    }











}
