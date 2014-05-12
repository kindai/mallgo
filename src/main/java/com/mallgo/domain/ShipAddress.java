package com.mallgo.domain;

import java.io.Serializable;

/**
 * Created by kin on 5/12/14.
 */
public class ShipAddress extends Address implements Serializable {

    private static final long serialVersionUID = -74921253450189893L;
    private String phoneNumber;
    private User shipUser;

    public User getShipUser() {
        return shipUser;
    }

    public void setShipUser(User shipUser) {
        this.shipUser = shipUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
