package com.mallgo.persistence;

import com.mallgo.model.Shop;
import com.mallgo.model.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int countByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int deleteByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    Shop selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOP
     *
     * @mbggenerated Thu May 15 18:43:20 CST 2014
     */
    int updateByPrimaryKey(Shop record);
}