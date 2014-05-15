package com.mallgo.old.domain;

import com.mallgo.common.enums.OrderActionType;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kin on 5/12/14.
 */
public class OrderAuditLog extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 6321792187424424931L;

    Order order;
    OrderActionType actionType;
    Date actionDate;
    String comment;
    User modifier;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderActionType getActionType() {
        return actionType;
    }

    public void setActionType(OrderActionType actionType) {
        this.actionType = actionType;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getModifier() {
        return modifier;
    }

    public void setModifier(User modifier) {
        this.modifier = modifier;
    }
}
