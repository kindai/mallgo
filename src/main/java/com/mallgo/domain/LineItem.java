package com.mallgo.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class LineItem extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 6804536240033522156L;

    private Order order;
    private int quantity;
    private Item item;
    private BigDecimal unitPrice;
    private BigDecimal total;

    public LineItem() {
    }

    public LineItem(CartItem cartItem) {
        this.quantity = cartItem.getQuantity();
        this.item = cartItem.getItem();
        this.unitPrice = cartItem.getItem().getListPrice();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    private void calculateTotal() {
        if (item != null && item.getListPrice() != null) {
            total = item.getListPrice().multiply(new BigDecimal(quantity));
        } else {
            total = null;
        }
    }

}
