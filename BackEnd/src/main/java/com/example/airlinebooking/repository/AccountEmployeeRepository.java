package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.AccountEmployee;
import org.springframework.data.repository.CrudRepository;

public interface AccountEmployeeRepository extends CrudRepository<AccountEmployee,Long> {
    AccountEmployee findByUsername(String username);
    AccountEmployee findById(long id);
    AccountEmployee findByCompany(long company);

    @Override
    Iterable<AccountEmployee> findAll();
}
