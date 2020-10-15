package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.ExceptionCheck;
import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.model.AccountEmployee;
import com.example.airlinebooking.model.Bookings;
import com.example.airlinebooking.model.TimeSlot;
import com.example.airlinebooking.repository.AccountEmployeeRepository;
import com.example.airlinebooking.repository.AccountRepository;
import com.example.airlinebooking.repository.BookingsRespository;
import com.example.airlinebooking.repository.TimeSlotRepository;
import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

@Service
public class BookingService {

    @Autowired
    BookingsRespository bookingsRespository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountEmployeeRepository accountEmployeeRepository;

    @Autowired
    TimeSlotRepository timeSlotRepository;


    public Bookings saveBooking(Bookings bookings){
        Bookings bookings1 = bookingsRespository.findById(bookings.getId());

        AccountEmployee accountEmployee = accountEmployeeRepository.findById(bookings.getWorkerID());

        TimeSlot timeSlot = timeSlotRepository.findByWorkersId(bookings.getWorkerID());

        Account account = accountRepository.findByid(bookings.getUserID());

        try {
            if (account != null && accountEmployee != null){
                if (bookings1 == null){
                    return bookingsRespository.save(bookings);
                } else {
                    bookings1 = bookings;
                    return bookingsRespository.save(bookings1);
                }
            } else {
                throw new ExceptionCheck("Account or Employee does not exist");
            }
        } catch (Exception e){
         throw new ExceptionCheck("Error");
        }
    }

    public boolean checker(Bookings bookings){
        boolean check = false;
        Bookings bookings1 = bookingsRespository.findById(bookings.getId());

        AccountEmployee accountEmployee = accountEmployeeRepository.findById(bookings.getWorkerID());

        TimeSlot timeSlot = timeSlotRepository.findByWorkersId(bookings.getWorkerID());

        Account account = accountRepository.findByid(bookings.getUserID());



        if ()
    }

    public boolean extractDay(Date date, TimeSlot timeSlot){

        boolean check;

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        int day = calendar.get(Calendar.DAY_OF_WEEK);


        switch (day) {
            case 1:
                check = false;
                break;

            case 2:
                if (!timeSlot.getMon().contains("n")){
                    check = false;
                    break;
                } else {
                    check = true;
                    break;
                }

            case 3:
                if (!timeSlot.getTue().contains("n")){
                    check = false;
                    break;
                } else {
                    check = true;
                    break;
                }
            case 4:
                if (!timeSlot.getWed().contains("n")){
                    check = false;
                    break;
                } else {
                    check = true;
                    break;
                }
            case 5:
                if (!timeSlot.getThur().contains("n")){
                    check = false;
                    break;
                } else {
                    check = true;
                    break;
                }
            case 6:
                if (!timeSlot.getFri().contains("n")){
                    check = false;
                    break;
                } else {
                    check = true;
                    break;
                }
            case 7:
                check = false;
                break;

            default:
                check = false;
        }

return check;
    }

    public Date endDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY,1);
        return calendar.getTime();
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

















}
