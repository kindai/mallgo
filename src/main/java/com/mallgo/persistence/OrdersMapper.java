package com.mallgo.persistence;

import com.mallgo.model.Orders;
import com.mallgo.model.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int countByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int deleteByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int insertSelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    Orders selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERS
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByPrimaryKey(Orders record);
}