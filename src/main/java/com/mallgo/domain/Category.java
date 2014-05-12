package com.mallgo.domain;

import java.io.Serializable;

public class Category extends AuditableEntity implements Serializable {

    private static final long serialVersionUID = 3992469837058393712L;

    private String name;
    private String description;
    Category parentCategory;

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
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
        return getId().toString();
    }

}
