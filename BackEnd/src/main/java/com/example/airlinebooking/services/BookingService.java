package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Bookings;
import com.example.airlinebooking.repository.BookingsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    BookingsRespository bookingsRespository;


    public Bookings saveBooking(Bookings bookings){
        Bookings bookings1 = bookingsRespository.findById(bookings.getId());

        if (bookings1 == null){
            return bookingsRespository.save(bookings);
        } else {
            bookings1 = bookings;

            return bookingsRespository.save(bookings1);
        }
    }



    public Bookings findByBookingId(long id){
        Bookings bookings = bookingsRespository.findById(id);

        return bookings;
    }


    public Bookings findByUserId(long id){
        Bookings bookings = bookingsRespository.findByUserID(id);

        return bookings;
    }

    public Bookings findByWorkerId(long id){
        Bookings bookings = bookingsRespository.findByWorkerID(id);

        return bookings;
    }

    public void deleteBooking(long id){
        Bookings bookings = bookingsRespository.findById(id);

        if (bookings == null){
            throw new AccountException("No Account Exists");
        } else {
            bookingsRespository.delete(bookings);
        }
    }


    public Iterable<Bookings> getAll(){
        return bookingsRespository.findAll();
    }

















}
