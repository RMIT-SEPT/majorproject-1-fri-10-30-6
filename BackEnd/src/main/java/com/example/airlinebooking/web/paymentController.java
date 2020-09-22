package com.example.airlinebooking.web;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.model.Payment;
import com.example.airlinebooking.model.TicketDetails;
import com.example.airlinebooking.services.AccountService;
import com.example.airlinebooking.services.PaymentService;
import com.example.airlinebooking.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/payment")
public class paymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private AccountService accountService;

    @PostMapping("")
    public ResponseEntity<?> createNewPayment(@RequestBody Payment payment){
        TicketDetails ticket = ticketService.findTicketByID(payment.getTicketId());
        Account account = accountService.findByUsername(payment.getUserName());

        if (ticket == null || account == null){
            throw new AccountException("Error");
        } else {
            Payment payment1 = paymentService.savePayment(payment);

            return new ResponseEntity<Payment>(payment1, HttpStatus.CREATED);
        }
    }


}
