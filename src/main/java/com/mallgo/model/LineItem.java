package com.mallgo.model;

import java.math.BigDecimal;
import java.util.Date;

public class LineItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.order_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.item_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.quantity
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.unitPrice
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private BigDecimal unitprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date createdTs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LINE_ITEM.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    private Date modifiedTs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.id
     *
     * @return the value of LINE_ITEM.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.id
     *
     * @param id the value for LINE_ITEM.id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.order_id
     *
     * @return the value of LINE_ITEM.order_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.order_id
     *
     * @param orderId the value for LINE_ITEM.order_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.item_id
     *
     * @return the value of LINE_ITEM.item_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.item_id
     *
     * @param itemId the value for LINE_ITEM.item_id
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.quantity
     *
     * @return the value of LINE_ITEM.quantity
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.quantity
     *
     * @param quantity the value for LINE_ITEM.quantity
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.unitPrice
     *
     * @return the value of LINE_ITEM.unitPrice
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public BigDecimal getUnitprice() {
        return unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.unitPrice
     *
     * @param unitprice the value for LINE_ITEM.unitPrice
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.created_by
     *
     * @return the value of LINE_ITEM.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.created_by
     *
     * @param createdBy the value for LINE_ITEM.created_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.modified_by
     *
     * @return the value of LINE_ITEM.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.modified_by
     *
     * @param modifiedBy the value for LINE_ITEM.modified_by
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.created_ts
     *
     * @return the value of LINE_ITEM.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getCreatedTs() {
        return createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.created_ts
     *
     * @param createdTs the value for LINE_ITEM.created_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LINE_ITEM.modified_ts
     *
     * @return the value of LINE_ITEM.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public Date getModifiedTs() {
        return modifiedTs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LINE_ITEM.modified_ts
     *
     * @param modifiedTs the value for LINE_ITEM.modified_ts
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    public void setModifiedTs(Date modifiedTs) {
        this.modifiedTs = modifiedTs;
    }
}