package com.mallgo.old.domain;

import com.mallgo.common.enums.ShopStatus;

import java.io.Serializable;

/**
 * Created by kin on 5/12/14.
 */
public class Shop extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = -7492633850670189553L;

    User adminUser;
    String name;
    Address address;
    private ShopStatus status;

    public User getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(User adminUser) {
        this.adminUser = adminUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShopStatus getStatus() {
        return status;
    }

    public void setStatus(ShopStatus status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
