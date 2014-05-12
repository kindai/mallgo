package com.mallgo.domain;

import java.io.Serializable;

/**
 * Created by kin on 5/12/14.
 */
public class Tag extends AuditableEntity implements Serializable {
    private static final long serialVersionUID = 3945469837053393712L;

    private String name;
    private String description;

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
