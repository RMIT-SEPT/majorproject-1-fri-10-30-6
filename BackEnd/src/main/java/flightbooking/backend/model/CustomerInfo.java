package flightbooking.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CustomerInfo {

    @Id @GeneratedValue
    private Integer id;
    private String userName;
    private String password;
    private String passportNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String gender;
    private String phoneNum;
    private Date dateOfBirth;
    private String issuedCountry;
    private Date issuedDate;
    private Date expiredDate;

    public CustomerInfo(@JsonProperty("id") Integer id, @JsonProperty("userName") String userName, @JsonProperty("password") String password, @JsonProperty("firstName") String firstName, @JsonProperty("middleName") String middleName,
                        @JsonProperty("lastName") String lastName, @JsonProperty("address") String address, @JsonProperty("dob") Date dateOfBirth,
                        @JsonProperty("passportNo") String passportNo, @JsonProperty("issuedCountry") String issuedCountry,
                        @JsonProperty("issuedDate") Date issuedDate, @JsonProperty("expiredDate") Date expiredDate, @JsonProperty("phoneNo") String phoneNo,
                        @JsonProperty("gender") String gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.passportNo = passportNo;
        this.issuedCountry = issuedCountry;
        this.issuedDate = issuedDate;
        this.expiredDate = expiredDate;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.phoneNum = phoneNo;

    }

    public CustomerInfo(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getIssuedCountry() {
        return issuedCountry;
    }

    public void setIssuedCountry(String issuedCountry) {
        this.issuedCountry = issuedCountry;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}
