package com.example.airlinebooking.repository;

import com.example.airlinebooking.model.AdminAccount;
import org.springframework.data.repository.CrudRepository;

public interface AdminAccountRepository extends CrudRepository<AdminAccount,Long> {

    AdminAccount findById(long id);
    AdminAccount findByUserName(String username);

    @Override
    Iterable<AdminAccount> findAll();


}
