package com.example.airlinebooking.repositories;

import com.example.airlinebooking.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    @Override
    Iterable<Account> findAllById(Iterable<Long> iterable);

    @Override
    <S extends Account> Iterable<S> saveAll(Iterable<S> iterable);
}
