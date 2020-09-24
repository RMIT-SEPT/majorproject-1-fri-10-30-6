package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByUsername(String username);
    @Override
    Iterable<Account> findAll();

    Account findByid(long id);


}
