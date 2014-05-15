package com.mallgo.model;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.category_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.shop_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.product_type
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long productType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.name
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.description
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date createdTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date modifiedTs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.id
     *
     * @return the value of PRODUCT.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.id
     *
     * @param id the value for PRODUCT.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.category_id
     *
     * @return the value of PRODUCT.category_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.category_id
     *
     * @param categoryId the value for PRODUCT.category_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.shop_id
     *
     * @return the value of PRODUCT.shop_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.shop_id
     *
     * @param shopId the value for PRODUCT.shop_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.product_type
     *
     * @return the value of PRODUCT.product_type
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.product_type
     *
     * @param productType the value for PRODUCT.product_type
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setProductType(Long productType) {
        this.productType = productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.name
     *
     * @return the value of PRODUCT.name
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.name
     *
     * @param name the value for PRODUCT.name
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.description
     *
     * @return the value of PRODUCT.description
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.description
     *
     * @param description the value for PRODUCT.description
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.created_by
     *
     * @return the value of PRODUCT.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.created_by
     *
     * @param createdBy the value for PRODUCT.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.modified_by
     *
     * @return the value of PRODUCT.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.modified_by
     *
     * @param modifiedBy the value for PRODUCT.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.created_ts
     *
     * @return the value of PRODUCT.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getCreatedTs() {
        return createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.created_ts
     *
     * @param createdTs the value for PRODUCT.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.modified_ts
     *
     * @return the value of PRODUCT.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getModifiedTs() {
        return modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.modified_ts
     *
     * @param modifiedTs the value for PRODUCT.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedTs(Date modifiedTs) {
        this.modifiedTs = modifiedTs;
    }
}