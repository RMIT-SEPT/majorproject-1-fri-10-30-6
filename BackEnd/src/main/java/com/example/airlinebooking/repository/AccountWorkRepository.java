package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.AccountWork;
import org.springframework.data.repository.CrudRepository;

public interface AccountWorkRepository extends CrudRepository<AccountWork, Long> {

    AccountWork findById(long id);
    AccountWork findByCompany(long company);
    AccountWork findByUsername(String username);

    @Override
    Iterable<AccountWork> findAll();







}
