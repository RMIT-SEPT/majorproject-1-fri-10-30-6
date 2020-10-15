package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.AccountEmployee;
import org.springframework.data.repository.CrudRepository;

public interface AccountEmployeeRepository extends CrudRepository<AccountEmployee,Long> {
    AccountEmployee findByUsername(String username);
    AccountEmployee findById(long id);
    AccountEmployee findByProfession(String profession);
    AccountEmployee findBySpecialty(String specialty);
    AccountEmployee findByCompany(String company);

    @Override
    Iterable<AccountEmployee> findAll();
}
