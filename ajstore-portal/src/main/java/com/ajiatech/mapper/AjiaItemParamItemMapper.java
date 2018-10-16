package com.ajiatech.mapper;

import com.ajiatech.pojo.AjiaItemParamItem;
import com.ajiatech.pojo.AjiaItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AjiaItemParamItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    long countByExample(AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int deleteByExample(AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int insert(AjiaItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int insertSelective(AjiaItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    List<AjiaItemParamItem> selectByExampleWithBLOBs(AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    List<AjiaItemParamItem> selectByExample(AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    AjiaItemParamItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByExampleSelective(@Param("record") AjiaItemParamItem record, @Param("example") AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") AjiaItemParamItem record, @Param("example") AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByExample(@Param("record") AjiaItemParamItem record, @Param("example") AjiaItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByPrimaryKeySelective(AjiaItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AjiaItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_item_param_item
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    int updateByPrimaryKey(AjiaItemParamItem record);
}