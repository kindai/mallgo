package com.mallgo.domain;

import com.mallgo.common.enums.OrderStatus;
import com.mallgo.common.enums.OrderType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 6321792448424424931L;

    private User user;
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    private Address shipAddress;
    private Courier courier;
    private BigDecimal totalPrice;
    private Payment payment;
    private Date orderDate;
    private OrderStatus status;
    private OrderType orderType;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(Address shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void initOrder(User user, Address shipAddress, BigDecimal totalPrice, Cart cart) {

        this.user = user;
        orderDate = new Date();

        this.shipAddress = shipAddress;

        this.totalPrice = totalPrice;

        status = OrderStatus.PENDPAY;

        Iterator<CartItem> i = cart.getAllCartItems();
        while (i.hasNext()) {
            CartItem cartItem = (CartItem) i.next();
            addLineItem(cartItem);
        }

    }

    public void addLineItem(CartItem cartItem) {
        LineItem lineItem = new LineItem(cartItem);
        addLineItem(lineItem);
    }

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

}
