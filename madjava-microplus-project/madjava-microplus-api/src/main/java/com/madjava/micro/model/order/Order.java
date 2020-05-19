package com.madjava.micro.model.order;

import java.math.BigDecimal;
import java.util.Date; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author accenture-
 */
public class Order extends AbstractOrderModel {

    private static final long serialVersionUID = 8991586388242209085L;
    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 支付状态
     */
    private String paymentStatus;

    /**
     * 支付流水
     */
    private String paymentInfo;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 运费
     */
    private BigDecimal totalPostAmount;

    /**
     * 税费
     */
    private BigDecimal totalTax;

    /**
     * 总重量
     */
    private Integer totalWeight;

    /**
     * 总折扣
     */
    private BigDecimal totalDiscounts;

    /**
     * 商品总金额
     */
    private BigDecimal subTotalAmount;

    /**
     * 总价
     */
    private BigDecimal totalAmount;

    /**
     * 是否同步到中间件
     */
    private Byte issyncMiddle;

	/**
	 * 销售应用 -app或wmall
	 */
	private String salesApplication;
    
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public BigDecimal getTotalPostAmount() {
		return totalPostAmount;
	}

	public void setTotalPostAmount(BigDecimal totalPostAmount) {
		this.totalPostAmount = totalPostAmount;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public Integer getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}

	public BigDecimal getTotalDiscounts() {
		return totalDiscounts;
	}

	public void setTotalDiscounts(BigDecimal totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	public BigDecimal getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(BigDecimal subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Byte getIssyncMiddle() {
		return issyncMiddle;
	}

	public void setIssyncMiddle(Byte issyncMiddle) {
		this.issyncMiddle = issyncMiddle;
	}
    
	public String getSalesApplication() {
		return salesApplication;
	}

	public void setSalesApplication(String salesApplication) {
		this.salesApplication = salesApplication;
	}
	
}
