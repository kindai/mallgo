package com.mallgo.model;

import java.util.Date;

public class Recommendation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.from_product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long fromProductId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.to_product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long toProductId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date createdTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECOMMENDATION.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date modifiedTs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.id
     *
     * @return the value of RECOMMENDATION.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.id
     *
     * @param id the value for RECOMMENDATION.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.from_product_id
     *
     * @return the value of RECOMMENDATION.from_product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getFromProductId() {
        return fromProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.from_product_id
     *
     * @param fromProductId the value for RECOMMENDATION.from_product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setFromProductId(Long fromProductId) {
        this.fromProductId = fromProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.to_product_id
     *
     * @return the value of RECOMMENDATION.to_product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getToProductId() {
        return toProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.to_product_id
     *
     * @param toProductId the value for RECOMMENDATION.to_product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setToProductId(Long toProductId) {
        this.toProductId = toProductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.created_by
     *
     * @return the value of RECOMMENDATION.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.created_by
     *
     * @param createdBy the value for RECOMMENDATION.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.modified_by
     *
     * @return the value of RECOMMENDATION.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.modified_by
     *
     * @param modifiedBy the value for RECOMMENDATION.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.created_ts
     *
     * @return the value of RECOMMENDATION.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getCreatedTs() {
        return createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.created_ts
     *
     * @param createdTs the value for RECOMMENDATION.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECOMMENDATION.modified_ts
     *
     * @return the value of RECOMMENDATION.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getModifiedTs() {
        return modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECOMMENDATION.modified_ts
     *
     * @param modifiedTs the value for RECOMMENDATION.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedTs(Date modifiedTs) {
        this.modifiedTs = modifiedTs;
    }
}