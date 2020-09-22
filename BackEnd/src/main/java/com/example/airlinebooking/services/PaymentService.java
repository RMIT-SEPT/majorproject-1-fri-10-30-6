package com.example.airlinebooking.services;

import com.example.airlinebooking.model.Payment;
import com.example.airlinebooking.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);

    }

    public Payment findByUsername(String username){
        Payment payment = paymentRepository.findByUserName(username);


        return payment;
    }

    public Payment findByFlightId(String flightid){
        Payment payment = paymentRepository.findByPlaneId(flightid);

        return payment;
    }

    public Payment findByTicketId(String id){
        Payment payment = paymentRepository.findByTicketId(id);

        return payment;
    }
}
