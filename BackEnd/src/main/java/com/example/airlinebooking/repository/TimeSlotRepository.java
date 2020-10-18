package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.TimeSlot;
import org.springframework.data.repository.CrudRepository;

public interface TimeSlotRepository extends CrudRepository<TimeSlot, Long> {

    TimeSlot findById(long id);
    TimeSlot findByWorkersId(long id);
    TimeSlot findByAvail(String avail);


    @Override
    Iterable<TimeSlot> findAll();



}
