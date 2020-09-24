package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Payment;
import com.example.airlinebooking.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment){
        Payment payment1 = paymentRepository.findByid(payment.getId());

        if (payment1 == null){
            payment.setUserName(payment.getUserName());
            return paymentRepository.save(payment);
        } else {
            payment1 = payment;
            return paymentRepository.save(payment1);
        }
    }

    public Payment findByUsername(String username){
        Payment payment = paymentRepository.findByUserName(username);
        if (payment == null) {
            throw new AccountException("This payment item does not exist!");
        } else {
            return payment;
        }
    }

    public Payment findByFlightId(String flightid){
        Payment payment = paymentRepository.findByPlaneId(flightid);

        if (payment == null) {
            throw new AccountException("This payment item does not exist!");
        } else {
            return payment;
        }
    }

    public Payment findByTicketId(String id){
        Payment payment = paymentRepository.findByTicketId(id);

        if (payment == null) {
            throw new AccountException("This payment item does not exist!");
        } else {
            return payment;
        }
    }

    public Payment findByID(long id) {
        Payment payment = paymentRepository.findByid(id);

        if (payment == null) {
            throw new AccountException("This payment item does not exist!");
        } else {
            return payment;
        }
    }

    public void deletePaymentInfo(long id){
        Payment payment = paymentRepository.findByid(id);
        if (payment == null) {
            throw new AccountException("This payment item does not exist!");
        } else {
            paymentRepository.delete(payment);
        }
    }

    public Iterable<Payment> findAll(){
        return paymentRepository.findAll();
    }
}
