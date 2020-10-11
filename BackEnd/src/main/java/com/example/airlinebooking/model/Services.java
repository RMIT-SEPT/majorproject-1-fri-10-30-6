package com.example.airlinebooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String CompanyName;
    private String CompanyType;
    private String CompanyManagerName;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyType() {
        return CompanyType;
    }

    public void setCompanyType(String companyType) {
        CompanyType = companyType;
    }

    public String getCompanyManagerName() {
        return CompanyManagerName;
    }

    public void setCompanyManagerName(String companyManagerName) {
        CompanyManagerName = companyManagerName;
    }
}
