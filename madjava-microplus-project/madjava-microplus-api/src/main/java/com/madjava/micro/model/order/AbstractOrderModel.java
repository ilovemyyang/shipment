package com.madjava.micro.model.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author madjava-
 */
public class AbstractOrderModel implements Serializable {

    private static final long serialVersionUID = 3591706025448082574L;

    /**
     * 主键
     */
    private String pk;
    
    private List<AbstractOrderEntryModel> entries;
    			 
    /**
     * 支付方式
     */
    private String paymentMode;

    /**
     * 配送方式
     */
    private String deliveryMode;
    
    /**
     * 实名认证
     */
    private String realnameAuth;

    /**
     * 用户PK
     */
    private String userPk;


    /**
     * 是否需要发票
     */
    private Byte isInvoice;

    /**
     * 发票
     */
    private String invoice;

    /**
     * 备注
     */
    private String notes;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * 配送地址
     */
    private String deliveryAddress;

    /**
     * 优惠券
     */
    private String customerVoucher;
    
    /**
     * 优惠码
     */
    private String promotionVoucher;
    
    /**
     * 促销结果
     */
    private String promotionResult;


	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getUserPk() {
		return userPk;
	}

	public void setUserPk(String userPk) {
		this.userPk = userPk;
	}

	public Byte getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(Byte isInvoice) {
		this.isInvoice = isInvoice;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getCustomerVoucher() {
		return customerVoucher;
	}

	public void setCustomerVoucher(String customerVoucher) {
		this.customerVoucher = customerVoucher;
	}

	public List<AbstractOrderEntryModel> getEntries() {
		return entries;
	}

	public void setEntries(List<AbstractOrderEntryModel> entries) {
		this.entries = entries;
	}

	public String getRealnameAuth() {
		return realnameAuth;
	}

	public void setRealnameAuth(String realnameAuth) {
		this.realnameAuth = realnameAuth;
	}

	public String getPromotionVoucher() {
		return promotionVoucher;
	}

	public void setPromotionVoucher(String promotionVoucher) {
		this.promotionVoucher = promotionVoucher;
	}

	public String getPromotionResult() {
		return promotionResult;
	}

	public void setPromotionResult(String promotionResult) {
		this.promotionResult = promotionResult;
	}

}
