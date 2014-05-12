package com.mallgo.domain;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: cam-dev
 * Date: 2/26/14
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AuditableEntity {

    private Long Id;

    private Date createdTime;

    private String createdBy;

    private Date modifiedTime;

    private String modifiedBy;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
