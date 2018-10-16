package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaCartItem;
import com.ajiatech.pojo.AjiaCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaCartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    long countByExample(AjiaCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int deleteByExample(AjiaCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int insert(AjiaCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int insertSelective(AjiaCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    List<AjiaCartItem> selectByExample(AjiaCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    AjiaCartItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByExampleSelective(@Param("record") AjiaCartItem record, @Param("example") AjiaCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByExample(@Param("record") AjiaCartItem record, @Param("example") AjiaCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByPrimaryKeySelective(AjiaCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_cart_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByPrimaryKey(AjiaCartItem record);
}