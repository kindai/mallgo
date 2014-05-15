package com.mallgo.old.domain;

import java.io.Serializable;

/**
 * Created by kin on 5/12/14.
 */
public class Comment extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 3992466109058393712L;

    private Product product;
    private String content;
    private User user;
    private Comment parentComment;
    private Order order;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
