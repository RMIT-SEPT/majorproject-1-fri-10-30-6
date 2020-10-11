package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.WorkersAccount;
import org.springframework.data.repository.CrudRepository;

public interface WorkersRepository extends CrudRepository<WorkersAccount, Long> {

    WorkersAccount findById(long id);
    WorkersAccount findByUsername(String Username);
    WorkersAccount findByFirstname(String firstname);
    WorkersAccount findByLastname(String lastname);
    WorkersAccount findByProfession(String profession);

    @Override
    Iterable<WorkersAccount> findAll();



}
