package com.mallgo.old.domain;

import com.mallgo.common.enums.UserStatus;
import com.mallgo.common.enums.UserType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class User extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 8751282105532159742L;

    private String username;
    private String password;
    private String email;
    private UserStatus status;
    private Long city;
    private Long state;
    private String zip;
    private Long country;
    private String phone;
    private Long languagePreference;
    private BigDecimal balance;
    private BigDecimal point;
    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getPoint() {
        return point;
    }

    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    private UserType userType;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getLanguagePreference() {
        return languagePreference;
    }

    public void setLanguagePreference(Long languagePreference) {
        this.languagePreference = languagePreference;
    }

}
