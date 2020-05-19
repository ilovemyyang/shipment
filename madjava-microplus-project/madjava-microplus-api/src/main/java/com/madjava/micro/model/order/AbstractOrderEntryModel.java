package com.madjava.micro.model.order;

import java.io.Serializable;
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
 * @author madjava-
 */
public class AbstractOrderEntryModel implements Serializable {

    private static final long serialVersionUID = -8969317371955394892L;

    /**
     * 主键
     */
    private String pk;

    /**
     * 商品
     */
    private String productCode;

    /**
     * 数量
     */
    private Integer quantity;


    /**
     * 是否选中
     */
    private Byte isSelected;


    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 门店
     */
    private String pointofservice;
    
    /**
     * 原价
     */
    private BigDecimal basePrice;

    /**
     * 实际价格-单品促销后的价格
     */
    private BigDecimal actPrice;
    
    /**
     * 退货价
     */
    private BigDecimal returnPrice;
    
    /**
     * 单品摊分价格-订单级促销摊分
     */
    private BigDecimal singleApportionPrice;
    
    /**
     * 单品摊分价格-促销尾差
     */
    private BigDecimal remainder;
    
    /**
     * 运费摊分价格
     */
    private BigDecimal postApportion;
    /**
     * 优惠摊分价格
     */ 
    private BigDecimal discountApportion;
    

    /**
     * 是否赠品
     */
    private Byte isGift;
    

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Byte getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Byte isSelected) {
		this.isSelected = isSelected;
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

	public String getPointofservice() {
		return pointofservice;
	}

	public void setPointofservice(String pointofservice) {
		this.pointofservice = pointofservice;
	}

	public Byte getIsGift() {
		return isGift;
	}

	public void setIsGift(Byte isGift) {
		this.isGift = isGift;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getActPrice() {
		return actPrice;
	}

	public void setActPrice(BigDecimal actPrice) {
		this.actPrice = actPrice;
	}

	public BigDecimal getReturnPrice() {
		return returnPrice;
	}

	public void setReturnPrice(BigDecimal returnPrice) {
		this.returnPrice = returnPrice;
	}

	public BigDecimal getSingleApportionPrice() {
		return singleApportionPrice;
	}

	public void setSingleApportionPrice(BigDecimal singleApportionPrice) {
		this.singleApportionPrice = singleApportionPrice;
	}

	public BigDecimal getRemainder() {
		return remainder;
	}

	public void setRemainder(BigDecimal remainder) {
		this.remainder = remainder;
	}

	public BigDecimal getPostApportion() {
		return postApportion;
	}

	public void setPostApportion(BigDecimal postApportion) {
		this.postApportion = postApportion;
	}

	public BigDecimal getDiscountApportion() {
		return discountApportion;
	}

	public void setDiscountApportion(BigDecimal discountApportion) {
		this.discountApportion = discountApportion;
	}
	
}
