package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.Bookings;
import org.springframework.data.repository.CrudRepository;

public interface BookingsRespository extends CrudRepository<Bookings,Long> {

    Bookings findById(long id);
    Bookings findByUserID(long id);
    Bookings findByWorkerID(long id);

    @Override
    Iterable<Bookings> findAll();

}