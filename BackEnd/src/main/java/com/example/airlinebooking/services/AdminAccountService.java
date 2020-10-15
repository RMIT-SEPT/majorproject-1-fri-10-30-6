package com.example.airlinebooking.services;

import com.example.airlinebooking.model.AdminAccount;
import com.example.airlinebooking.repository.AdminAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAccountService {

    @Autowired
    AdminAccountRepository adminAccountRepository;


    public AdminAccount addAccount(AdminAccount adminAccount){
        AdminAccount adminAccount1 = adminAccountRepository.findById(adminAccount.getId());

        if (adminAccount1 == null){
            return adminAccountRepository.save(adminAccount);
        } else {
            adminAccount1 = adminAccount;

            return adminAccountRepository.save(adminAccount1);
        }
    }


    public AdminAccount findById(long id){
        AdminAccount adminAccount = adminAccountRepository.findById(id);

        return adminAccount;

    }


    public AdminAccount findByUserName(String username){
        AdminAccount adminAccount = adminAccountRepository.findByUsername(username);

        return adminAccount;
    }







}
