package com.madjava.micro.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 商品渠道价格表
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-30 10:36:04
 */
@Table(name = "product_channel_price")
public class ProductChannelPrice implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //商品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //渠道编码
    public static final String _CHANNELCODE = "channelCode";
	
	    //价格类型
    public static final String _PRICETYPE = "priceType";
	
	    //价格
    public static final String _PRICE = "price";
	
	    //是否启用
    public static final String _ENABLE = "enable";
	
	    //开始时间
    public static final String _STARTDATE = "startDate";
	
	    //结束时间
    public static final String _ENDDATE = "endDate";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //修改时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //主键
    @Id
    private String pk;
	
	    //商品编码
    @Column(name = "product_code")
    private String productCode;
	
	    //渠道编码
    @Column(name = "channel_code")
    private String channelCode;
	
	    //价格类型
    @Column(name = "price_type")
    private String priceType;
	
	    //价格
    @Column(name = "price")
    private BigDecimal price;
	
	    //是否启用
    @Column(name = "enable")
    private Boolean enable;
	
	    //开始时间
    @Column(name = "start_date")
    private Date startDate;
	
	    //结束时间
    @Column(name = "end_date")
    private Date endDate;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //创建人
    @Column(name = "create_by")
    private String createBy;
	
	    //修改时间
    @Column(name = "update_time")
    private Date updateTime;
	
	    //更新人
    @Column(name = "update_by")
    private String updateBy;
	

	/**
	 * 设置：主键
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * 获取：主键
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * 设置：商品编码
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * 获取：商品编码
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * 设置：渠道编码
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	/**
	 * 获取：渠道编码
	 */
	public String getChannelCode() {
		return channelCode;
	}
	/**
	 * 设置：价格类型
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	/**
	 * 获取：价格类型
	 */
	public String getPriceType() {
		return priceType;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：是否启用
	 */
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	/**
	 * 获取：是否启用
	 */
	public Boolean getEnable() {
		return enable;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdateBy() {
		return updateBy;
	}
}
