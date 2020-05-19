package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-30 10:36:04
 */
@Table(name = "product_channel")
public class ProductChannel implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //商品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //渠道编码
    public static final String _CHANNELCODE = "channelCode";
	
	    //外部渠道商品编码
    public static final String _CHANNELPRODUCTCODE = "channelProductCode";
    
    	//渠道商品名称
    public static final String _NAME = "name";
	
	    //渠道商品副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //渠道商品文描
    public static final String _DESCRIPTION = "description";
	
	    //渠道商品h5文描
    public static final String _MDESCRIPTION = "mdescription";
	
	    //是否启用
    public static final String _ENABLE = "enable";
	
	    //上下架状态
    public static final String _STATUS = "status";
	
	    //上架开始时间
    public static final String _STARTDATE = "startDate";
	
	    //上架结束时间
    public static final String _ENDDATE = "endDate";
	
	    //库存渠道权重(100%)
    public static final String _STOCKWEIGHT = "stockWeight";
	
	    //是否是sku
    public static final String _ISSKU = "isSku";
	
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
	
	    //外部渠道商品编码
    @Column(name = "channel_product_code")
    private String channelProductCode;
    
    	//渠道商品名称
    @Column(name = "name")
    private String name;
	
	    //渠道商品副标题
    @Column(name = "subtitle")
    private String subtitle;
	
	    //渠道商品文描
    @Column(name = "description")
    private String description;
	
	    //渠道商品h5文描
    @Column(name = "mdescription")
    private String mdescription;
	
	    //是否启用
    @Column(name = "enable")
    private Boolean enable;
	
	    //上下架状态
    @Column(name = "status")
    private String status;
	
	    //上架开始时间
    @Column(name = "start_date")
    private Date startDate;
	
	    //上架结束时间
    @Column(name = "end_date")
    private Date endDate;
	
	    //库存渠道权重(100%)
    @Column(name = "stock_weight")
    private Integer stockWeight;
	
	    //是否是sku
    @Column(name = "is_sku")
    private Boolean isSku;
	
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

    	//库存阀值
	@Column(name = "limit_stock")
	private Integer limitStock;
    
    private List<ProductChannelPrice> productChannelPrices;
    
    private List<ProductChannelLp> productChannelLps;
	

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
	 * 设置：外部渠道商品编码
	 */
	public void setChannelProductCode(String channelProductCode) {
		this.channelProductCode = channelProductCode;
	}
	/**
	 * 获取：外部渠道商品编码
	 */
	public String getChannelProductCode() {
		return channelProductCode;
	}
	/**
	 * 设置：渠道商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：渠道商品名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：渠道商品副标题
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * 获取：渠道商品副标题
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * 设置：渠道商品文描
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：渠道商品文描
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：渠道商品h5文描
	 */
	public void setMdescription(String mdescription) {
		this.mdescription = mdescription;
	}
	/**
	 * 获取：渠道商品h5文描
	 */
	public String getMdescription() {
		return mdescription;
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
	 * 设置：上下架状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：上下架状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：上架开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：上架开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：上架结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：上架结束时间
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置：库存渠道权重(100%)
	 */
	public void setStockWeight(Integer stockWeight) {
		this.stockWeight = stockWeight;
	}
	/**
	 * 获取：库存渠道权重(100%)
	 */
	public Integer getStockWeight() {
		return stockWeight;
	}
	/**
	 * 设置：是否是sku
	 */
	public void setIsSku(Boolean isSku) {
		this.isSku = isSku;
	}
	/**
	 * 获取：是否是sku
	 */
	public Boolean getIsSku() {
		return isSku;
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

	public Integer getLimitStock() {
		return limitStock;
	}

	public void setLimitStock(Integer limitStock) {
		this.limitStock = limitStock;
	}

	public List<ProductChannelPrice> getProductChannelPrices() {
		return productChannelPrices;
	}
	public void setProductChannelPrices(List<ProductChannelPrice> productChannelPrices) {
		this.productChannelPrices = productChannelPrices;
	}
	public List<ProductChannelLp> getProductChannelLps() {
		return productChannelLps;
	}
	public void setProductChannelLps(List<ProductChannelLp> productChannelLps) {
		this.productChannelLps = productChannelLps;
	}
}
