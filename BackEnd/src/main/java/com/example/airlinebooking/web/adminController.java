package com.example.airlinebooking.web;

import com.example.airlinebooking.model.AdminAccount;
import com.example.airlinebooking.services.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/admin")
public class adminController {
    @Autowired
    AdminAccountService adminAccountService;


    @PostMapping("")
    public ResponseEntity<?> createNewAdminAccount(@RequestBody AdminAccount adminAccount){
        AdminAccount adminAccount1 = adminAccountService.addAccount(adminAccount);

        return new ResponseEntity<AdminAccount>(adminAccount1, HttpStatus.CREATED);
    }

    @GetMapping("/accountbyid/{id}")
    public ResponseEntity<?> findAccountByID(@PathVariable long id){

        AdminAccount adminAccount = adminAccountService.findById(id);

        return new ResponseEntity<AdminAccount>(adminAccount,HttpStatus.FOUND);

    }

}
