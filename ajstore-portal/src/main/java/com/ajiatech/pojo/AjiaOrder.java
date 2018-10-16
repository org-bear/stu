package com.ajiatech.pojo;

import java.io.Serializable;
import java.util.Date;

import com.ajiatech.exception.UserIdIsNullException;

public class AjiaOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.order_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.user_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.add_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Long addId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.payment
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Double payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.payment_type
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Integer paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.post_fee
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Double postFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.status
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.create_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.update_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.payment_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Date paymentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.consign_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Date consignTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.end_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.close_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Date closeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.shipping_name
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private String shippingName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.shipping_code
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private String shippingCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.buyer_message
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private String buyerMessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.buyer_nick
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private String buyerNick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ajia_order.buyer_rate
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private Integer buyerRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ajia_order
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.order_id
     *
     * @return the value of ajia_order.order_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.order_id
     *
     * @param orderId the value for ajia_order.order_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.user_id
     *
     * @return the value of ajia_order.user_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.user_id
     *
     * @param userId the value for ajia_order.user_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setUserId(Long userId) throws Exception{
    	if (userId==null){
    		UserIdIsNullException exception=
    				new UserIdIsNullException();
    		throw exception;
    	}
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.add_id
     *
     * @return the value of ajia_order.add_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Long getAddId() {
        return addId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.add_id
     *
     * @param addId the value for ajia_order.add_id
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setAddId(Long addId) {
        this.addId = addId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.payment
     *
     * @return the value of ajia_order.payment
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Double getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.payment
     *
     * @param payment the value for ajia_order.payment
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setPayment(Double payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.payment_type
     *
     * @return the value of ajia_order.payment_type
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.payment_type
     *
     * @param paymentType the value for ajia_order.payment_type
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.post_fee
     *
     * @return the value of ajia_order.post_fee
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Double getPostFee() {
        return postFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.post_fee
     *
     * @param postFee the value for ajia_order.post_fee
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setPostFee(Double postFee) {
        this.postFee = postFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.status
     *
     * @return the value of ajia_order.status
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.status
     *
     * @param status the value for ajia_order.status
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.create_time
     *
     * @return the value of ajia_order.create_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.create_time
     *
     * @param createTime the value for ajia_order.create_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.update_time
     *
     * @return the value of ajia_order.update_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.update_time
     *
     * @param updateTime the value for ajia_order.update_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.payment_time
     *
     * @return the value of ajia_order.payment_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.payment_time
     *
     * @param paymentTime the value for ajia_order.payment_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.consign_time
     *
     * @return the value of ajia_order.consign_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.consign_time
     *
     * @param consignTime the value for ajia_order.consign_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.end_time
     *
     * @return the value of ajia_order.end_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.end_time
     *
     * @param endTime the value for ajia_order.end_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.close_time
     *
     * @return the value of ajia_order.close_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.close_time
     *
     * @param closeTime the value for ajia_order.close_time
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.shipping_name
     *
     * @return the value of ajia_order.shipping_name
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.shipping_name
     *
     * @param shippingName the value for ajia_order.shipping_name
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.shipping_code
     *
     * @return the value of ajia_order.shipping_code
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.shipping_code
     *
     * @param shippingCode the value for ajia_order.shipping_code
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.buyer_message
     *
     * @return the value of ajia_order.buyer_message
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.buyer_message
     *
     * @param buyerMessage the value for ajia_order.buyer_message
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.buyer_nick
     *
     * @return the value of ajia_order.buyer_nick
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.buyer_nick
     *
     * @param buyerNick the value for ajia_order.buyer_nick
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ajia_order.buyer_rate
     *
     * @return the value of ajia_order.buyer_rate
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public Integer getBuyerRate() {
        return buyerRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ajia_order.buyer_rate
     *
     * @param buyerRate the value for ajia_order.buyer_rate
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ajia_order
     *
     * @mbg.generated Thu Jul 19 15:34:23 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", addId=").append(addId);
        sb.append(", payment=").append(payment);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", postFee=").append(postFee);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", consignTime=").append(consignTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", shippingName=").append(shippingName);
        sb.append(", shippingCode=").append(shippingCode);
        sb.append(", buyerMessage=").append(buyerMessage);
        sb.append(", buyerNick=").append(buyerNick);
        sb.append(", buyerRate=").append(buyerRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}