package com.example.airlinebooking.services;

import com.example.airlinebooking.exceptions.AccountException;
import com.example.airlinebooking.model.AccountEmployee;
import com.example.airlinebooking.repository.AccountEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountEmployeeService {
    @Autowired
    AccountEmployeeRepository accountEmployeeRepository;

    public AccountEmployee createNew(AccountEmployee accountEmployee){
        AccountEmployee accountEmployee1 = accountEmployeeRepository.findById(accountEmployee.getId());

        try{

            if (accountEmployee1 == null){
                return accountEmployeeRepository.save(accountEmployee);
            } else {
                accountEmployee1.setUsername(accountEmployee.getUsername());
                return accountEmployeeRepository.save(accountEmployee1);
            }

        }catch (Exception e){
            throw new AccountException("Error");
        }
    }



    public AccountEmployee findById(long id){
        AccountEmployee accountEmployee = accountEmployeeRepository.findById(id);

        if (accountEmployee == null){
            System.out.println();
            return null;
        } else {
            return accountEmployee;
        }
    }


    public AccountEmployee findBySpecialty(String Specialty){
        AccountEmployee accountEmployee = accountEmployeeRepository.findBySpecialty(Specialty);

        return accountEmployee;
    }

    public AccountEmployee findByProfession(String Profession){
        AccountEmployee accountEmployee = accountEmployeeRepository.findByProfession(Profession);

        return accountEmployee;
    }

    public AccountEmployee findByCompany(String Company){
        AccountEmployee accountEmployee = accountEmployeeRepository.findByCompany(Company);

        return accountEmployee;
    }

    public void deleteEmployee(long id){
        AccountEmployee accountEmployee1 = accountEmployeeRepository.findById(id);

        accountEmployeeRepository.delete(accountEmployee1);
    }


    public Iterable<AccountEmployee> findAll(){
        return accountEmployeeRepository.findAll();
    }





}
