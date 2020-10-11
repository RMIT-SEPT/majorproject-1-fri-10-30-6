package com.example.airlinebooking.services;


import com.example.airlinebooking.model.WorkersAccount;
import com.example.airlinebooking.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkersService {

    @Autowired
    WorkersRepository workersRepository;


    public WorkersAccount addWorker(WorkersAccount workersAccount){
        Optional<WorkersAccount> workersAccount1 = workersRepository.findById(workersAccount.getId());

        if (workersAccount1 == null){
            return workersRepository.save(workersAccount);
        } else {
            workersAccount1 = Optional.of(workersAccount);
        }
    }

    public WorkersAccount findWorkerById(long id){
        WorkersAccount workersAccount = workersRepository.findById(id);

        return workersAccount;
    }

}
