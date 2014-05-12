package com.mallgo.domain;

import com.mallgo.common.enums.ItemStatus;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = -2159121673445254631L;

    private Product product;
    private BigDecimal listPrice;
    private BigDecimal originPrice;
    private ItemStatus status;
    private String attribute;
    private int inStockQuantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(BigDecimal originPrice) {
        this.originPrice = originPrice;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getInStockQuantity() {
        return inStockQuantity;
    }

    public void setInStockQuantity(int inStockQuantity) {
        this.inStockQuantity = inStockQuantity;
    }
}
