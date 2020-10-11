package com.example.airlinebooking.services;


import com.example.airlinebooking.model.TimeSlot;
import com.example.airlinebooking.repository.TimeSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeSlotService {

    @Autowired
    TimeSlotRepository timeSlotRepository;

    public TimeSlot addTimeSlot(TimeSlot timeSlot){
        TimeSlot timeSlot1 = timeSlotRepository.findByWorkersId(timeSlot.getWorkersId());

        if (timeSlot1 == null){
            return timeSlotRepository.save(timeSlot);
        } else {
            timeSlot1 = timeSlot;

            return timeSlotRepository.save(timeSlot1);
        }
    }

    public TimeSlot findById(long id){
        TimeSlot timeSlot = timeSlotRepository.findById(id);

        return timeSlot;
    }

    public TimeSlot findByWorkersId(long id){
        TimeSlot timeSlot = timeSlotRepository.findByWorkersId(id);

        return timeSlot;
    }





}
