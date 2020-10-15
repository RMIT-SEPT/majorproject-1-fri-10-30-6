package com.example.airlinebooking.services;


import com.example.airlinebooking.model.WorkersAccount;
import com.example.airlinebooking.repository.WorkersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorkersService {

    @Autowired
    WorkersRepository workersRepository;


    public WorkersAccount addWorker(WorkersAccount workersAccount){


        WorkersAccount workersAccount1 = workersRepository.findById(workersAccount.getId());


        if (workersAccount1 == null){
            return workersRepository.save(workersAccount);
        } else {
            workersAccount1 = Optional.of(workersAccount);
            return workersRepository.save(workersAccount1);
        }
    }

    public WorkersAccount findWorkerById(long id){
        WorkersAccount workersAccount = workersRepository.findById(id);

        return workersAccount;
    }

}
