package com.mallgo.domain;

/**
 * Created by kin on 5/12/14.
 */
public class Address extends AuditableEntity{
    private Long city;
    private Long state;
    private String zip;
    private Long country;
    private String detail;
    private User ownUser;

    public User getOwnUser() {
        return ownUser;
    }

    public void setOwnUser(User ownUser) {
        this.ownUser = ownUser;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
