package com.mallgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.username
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.email
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.status
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.city
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.state
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.country
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.zip
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String zip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.phone
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.languagePreference
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long languagepreference;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.balance
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.point
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private BigDecimal point;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date createdTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date modifiedTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.password
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private byte[] password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.id
     *
     * @return the value of USER.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.id
     *
     * @param id the value for USER.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.username
     *
     * @return the value of USER.username
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.username
     *
     * @param username the value for USER.username
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.email
     *
     * @return the value of USER.email
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.email
     *
     * @param email the value for USER.email
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.status
     *
     * @return the value of USER.status
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.status
     *
     * @param status the value for USER.status
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.city
     *
     * @return the value of USER.city
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.city
     *
     * @param city the value for USER.city
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCity(Long city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.state
     *
     * @return the value of USER.state
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.state
     *
     * @param state the value for USER.state
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setState(Long state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.country
     *
     * @return the value of USER.country
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.country
     *
     * @param country the value for USER.country
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCountry(Long country) {
        this.country = country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.zip
     *
     * @return the value of USER.zip
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.zip
     *
     * @param zip the value for USER.zip
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.phone
     *
     * @return the value of USER.phone
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.phone
     *
     * @param phone the value for USER.phone
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.languagePreference
     *
     * @return the value of USER.languagePreference
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getLanguagepreference() {
        return languagepreference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.languagePreference
     *
     * @param languagepreference the value for USER.languagePreference
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setLanguagepreference(Long languagepreference) {
        this.languagepreference = languagepreference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.balance
     *
     * @return the value of USER.balance
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.balance
     *
     * @param balance the value for USER.balance
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.point
     *
     * @return the value of USER.point
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public BigDecimal getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.point
     *
     * @param point the value for USER.point
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.created_by
     *
     * @return the value of USER.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.created_by
     *
     * @param createdBy the value for USER.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.modified_by
     *
     * @return the value of USER.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.modified_by
     *
     * @param modifiedBy the value for USER.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.created_ts
     *
     * @return the value of USER.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getCreatedTs() {
        return createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.created_ts
     *
     * @param createdTs the value for USER.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.modified_ts
     *
     * @return the value of USER.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getModifiedTs() {
        return modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.modified_ts
     *
     * @param modifiedTs the value for USER.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedTs(Date modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.password
     *
     * @return the value of USER.password
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.password
     *
     * @param password the value for USER.password
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setPassword(byte[] password) {
        this.password = password;
    }
}