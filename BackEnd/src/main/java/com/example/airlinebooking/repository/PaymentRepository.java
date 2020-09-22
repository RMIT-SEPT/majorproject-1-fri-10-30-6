package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

    Payment findByUserName(String username);

    @Override
    Iterable<Payment> findAll();


    Payment findByTicketId(String id);

    Payment findByPlaneId(String planeid);
    
}
