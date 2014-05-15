package com.mallgo.model;

import java.util.Date;

public class Comment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.user_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.parent_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.order_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.content
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date createdTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date modifiedTs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.id
     *
     * @return the value of COMMENT.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.id
     *
     * @param id the value for COMMENT.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.product_id
     *
     * @return the value of COMMENT.product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.product_id
     *
     * @param productId the value for COMMENT.product_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.user_id
     *
     * @return the value of COMMENT.user_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.user_id
     *
     * @param userId the value for COMMENT.user_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.parent_id
     *
     * @return the value of COMMENT.parent_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.parent_id
     *
     * @param parentId the value for COMMENT.parent_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.order_id
     *
     * @return the value of COMMENT.order_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.order_id
     *
     * @param orderId the value for COMMENT.order_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.content
     *
     * @return the value of COMMENT.content
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.content
     *
     * @param content the value for COMMENT.content
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.created_by
     *
     * @return the value of COMMENT.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.created_by
     *
     * @param createdBy the value for COMMENT.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.modified_by
     *
     * @return the value of COMMENT.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.modified_by
     *
     * @param modifiedBy the value for COMMENT.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.created_ts
     *
     * @return the value of COMMENT.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getCreatedTs() {
        return createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.created_ts
     *
     * @param createdTs the value for COMMENT.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.modified_ts
     *
     * @return the value of COMMENT.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getModifiedTs() {
        return modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.modified_ts
     *
     * @param modifiedTs the value for COMMENT.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedTs(Date modifiedTs) {
        this.modifiedTs = modifiedTs;
    }
}