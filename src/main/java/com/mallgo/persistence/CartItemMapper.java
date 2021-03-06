package com.mallgo.persistence;

import com.mallgo.model.CartItem;
import com.mallgo.model.CartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int countByExample(CartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int deleteByExample(CartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int insert(CartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int insertSelective(CartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    List<CartItem> selectByExample(CartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    CartItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByExampleSelective(@Param("record") CartItem record, @Param("example") CartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByExample(@Param("record") CartItem record, @Param("example") CartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByPrimaryKeySelective(CartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CART_ITEM
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByPrimaryKey(CartItem record);
}