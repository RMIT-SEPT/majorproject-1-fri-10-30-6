package com.example.airlinebooking.web;

import com.example.airlinebooking.exceptions.ExceptionCheck;
import com.example.airlinebooking.model.Account;
import com.example.airlinebooking.model.Payment;
import com.example.airlinebooking.services.AccountService;
import com.example.airlinebooking.services.PaymentService;
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
    private AccountService accountService;

    @PostMapping("")
    public ResponseEntity<?> createNewPayment(@RequestBody Payment payment){
        Account account = accountService.findByUsername(payment.getUserName());

        if (account == null){
            throw new ExceptionCheck("Error");
        } else {
            Payment payment1 = paymentService.savePayment(payment);

            return new ResponseEntity<Payment>(payment1, HttpStatus.CREATED);
        }
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<?> findPaymentByUsername(@PathVariable String username){
        Payment payment = paymentService.findByUsername(username);

        return new ResponseEntity<Payment>(payment,HttpStatus.FOUND);
    }

    @GetMapping("/dataid/{id}")
    public ResponseEntity<?> findPaymentByID(@PathVariable long id){
        Payment payment = paymentService.findByID(id);

        return new ResponseEntity<Payment>(payment,HttpStatus.FOUND);
    }

    @GetMapping("/all")
    public Iterable<?> getAllPayments(){
        return paymentService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePayment(@PathVariable long id){
        paymentService.deletePaymentInfo(id);

        return new ResponseEntity<String>("Payment Deleted",HttpStatus.OK);
    }
}
