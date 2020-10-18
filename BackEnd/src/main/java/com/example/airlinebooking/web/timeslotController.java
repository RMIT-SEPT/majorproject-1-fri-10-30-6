package com.example.airlinebooking.web;

import com.example.airlinebooking.model.TimeSlot;
import com.example.airlinebooking.services.TimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/timeslot")
public class timeslotController {

    @Autowired
    TimeSlotService timeSlotService;

    @PostMapping("")
    public ResponseEntity<?> createNewTimeSlot(@RequestBody TimeSlot timeSlot){
        TimeSlot timeSlot1 = timeSlotService.addTimeSlot(timeSlot);

        return new ResponseEntity<TimeSlot>(timeSlot1, HttpStatus.CREATED);
    }


    @GetMapping("/times/{workersid}")
    public ResponseEntity<?> getTimeSlotByWorker(@PathVariable long id){
        TimeSlot timeSlot = timeSlotService.findByWorkersId(id);

        return new ResponseEntity<TimeSlot>(timeSlot,HttpStatus.FOUND);
    }


    @GetMapping("/all")
    public Iterable<?> getAllTimeSlot(){
        return timeSlotService.getAllTimeSlot();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTimeSlot(@PathVariable long id){
        timeSlotService.deleteTimeSlot(id);

        return new ResponseEntity<String>("TimeSlot Deleted",HttpStatus.OK);
    }


}
