package com.example.airlinebooking.web;

import com.example.airlinebooking.model.AccountEmployee;
import com.example.airlinebooking.services.AccountEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    AccountEmployeeService accountEmployeeService;

    @PostMapping("")
    public ResponseEntity<?> createNewAccount(@RequestBody AccountEmployee accountEmployee){
        AccountEmployee accountEmployee1 = accountEmployeeService.createNew(accountEmployee);

        return new ResponseEntity<AccountEmployee>(accountEmployee1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<?> findAll(){
        return accountEmployeeService.findAll();
    }


    @GetMapping("/workerid/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        AccountEmployee accountEmployee = accountEmployeeService.findById(id);

        return new ResponseEntity<AccountEmployee>(accountEmployee,HttpStatus.FOUND);
    }

    @GetMapping("/company/{company}")
    ResponseEntity<?> findByCompany(@PathVariable String company){
        AccountEmployee accountEmployee = accountEmployeeService.findByCompany(company);

        return new ResponseEntity<AccountEmployee>(accountEmployee,HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<?> deleteByID(@PathVariable long id){

        accountEmployeeService.deleteEmployee(id);

        return new ResponseEntity<String>("Account is deleted",HttpStatus.OK);
    }



}