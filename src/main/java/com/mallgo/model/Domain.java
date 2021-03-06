package com.mallgo.model;

import java.util.Date;

public class Domain {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.name
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.usage
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String usage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.alias
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String alias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date createdTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOMAIN.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date modifiedTs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.id
     *
     * @return the value of DOMAIN.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.id
     *
     * @param id the value for DOMAIN.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.name
     *
     * @return the value of DOMAIN.name
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.name
     *
     * @param name the value for DOMAIN.name
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.usage
     *
     * @return the value of DOMAIN.usage
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getUsage() {
        return usage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.usage
     *
     * @param usage the value for DOMAIN.usage
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.alias
     *
     * @return the value of DOMAIN.alias
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.alias
     *
     * @param alias the value for DOMAIN.alias
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.created_by
     *
     * @return the value of DOMAIN.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.created_by
     *
     * @param createdBy the value for DOMAIN.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.modified_by
     *
     * @return the value of DOMAIN.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.modified_by
     *
     * @param modifiedBy the value for DOMAIN.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.created_ts
     *
     * @return the value of DOMAIN.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getCreatedTs() {
        return createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.created_ts
     *
     * @param createdTs the value for DOMAIN.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOMAIN.modified_ts
     *
     * @return the value of DOMAIN.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getModifiedTs() {
        return modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOMAIN.modified_ts
     *
     * @param modifiedTs the value for DOMAIN.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedTs(Date modifiedTs) {
        this.modifiedTs = modifiedTs;
    }
}