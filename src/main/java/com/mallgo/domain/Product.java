package com.mallgo.domain;

import com.mallgo.common.enums.ProductType;

import java.io.Serializable;
import java.util.List;

public class Product extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = -7492639752670189553L;

    private Long categoryId;
    private Shop shop;
    private String name;
    private String description;
    private ProductType productType;
    private List<Tag> tags;
    private List<Comment> comments;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return getName();
    }

}
