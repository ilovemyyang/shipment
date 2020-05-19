package com.madjava.micro.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //产品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //商品名称
    public static final String _NAME = "name";
	
	    //商品副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //商品文描
    public static final String _DESCRIPTION = "description";
	
	    //h5商品文描
    public static final String _MDESCRIPTION = "mdescription";
	
	    //商品条形码
    public static final String _EAN = "ean";
	
	    //商品类型
    public static final String _TYPE = "type";
	
	    //品牌
    public static final String _BRAND = "brand";
	
	    //单位
    public static final String _UNIT = "unit";
	
	    //产地
    public static final String _ORIGIN = "origin";
	
	    //重量(克)
    public static final String _WEIGHT = "weight";
	
	    //规格
    public static final String _SPECIFICATION = "specification";
	
	    //销项税率(%)
    public static final String _TAXRATE = "taxRate";
	
	    //保质期
    public static final String _SHELFLIFE = "shelfLife";
	
	    //指导价格
    public static final String _GUIDINGPRICE = "guidingPrice";
	
	    //母品
    public static final String _BASEPRODUCT = "baseProduct";
	
	    //属性
    public static final String _FIELD1 = "field1";
	
	    //属性取值
    public static final String _VALUE1 = "value1";
	
	    //属性
    public static final String _FIELD2 = "field2";
	
	    //属性取值
    public static final String _VALUE2 = "value2";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //修改时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
	
	    //长(单位:mm)
    public static final String _LENGTH = "length";
	
	    //宽(单位:mm)
    public static final String _WIDE = "wide";
	
	    //高(单位:mm)
    public static final String _HIGH = "high";
	
	    //
    public static final String _ENCODESTR = "encodeStr";
	
	    //版本控制
    public static final String _VERSION = "version";
    
    	//库存分配方式
    public static final String _STOCKSHARETYPE = "stockShareType";
	
	    //主键
    @Id
    private String pk;
	
	    //产品编码
    @Column(name = "product_code")
    private String productCode;
    
    	//商品名称
	@Column(name = "name")
	private String name;
	
	    //商品副标题
	@Column(name = "subtitle")
	private String subtitle;
	
	    //商品文描
	@Column(name = "description")
	private String description;
	
	    //h5商品文描
	@Column(name = "mdescription")
	private String mdescription;
	
	    //商品条形码
    @Column(name = "ean")
    private String ean;
	
	    //商品类型
    @Column(name = "type")
    private String type;
	
	    //品牌
    @Column(name = "brand")
    private Long brand;
	
	    //单位
    @Column(name = "unit")
    private String unit;
	
	    //产地
    @Column(name = "origin")
    private String origin;
	
	    //重量(克)
    @Column(name = "weight")
    private Integer weight;
	
	    //规格
    @Column(name = "specification")
    private String specification;
	
	    //销项税率(%)
    @Column(name = "tax_rate")
    private BigDecimal taxRate;
	
	    //保质期
    @Column(name = "shelf_life")
    private String shelfLife;
	
	    //指导价格
    @Column(name = "guiding_price")
    private BigDecimal guidingPrice;
	
	    //母品
    @Column(name = "base_product")
    private String baseProduct;
	
	    //属性
    @Column(name = "field1")
    private String field1;
	
	    //属性取值
    @Column(name = "value1")
    private String value1;
	
	    //属性
    @Column(name = "field2")
    private String field2;
	
	    //属性取值
    @Column(name = "value2")
    private String value2;
	
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
	
	    //长(单位:mm)
    @Column(name = "length")
    private Integer length;
	
	    //宽(单位:mm)
    @Column(name = "wide")
    private Integer wide;
	
	    //高(单位:mm)
    @Column(name = "high")
    private Integer high;
	
	    //
    @Column(name = "encode_str")
    private String encodeStr;
	
	    //版本控制
    @Column(name = "version")
    private Integer version;
    
    	//库存分配方式
    @Column(name = "stock_share_type")
    private String stockShareType;

		//共享库存比例
	@Column(name = "share_stock")
	private Integer shareStock;
    
    private List<ProductChannel> productChannels;
	
	private List<Productlp> productlps;
	
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
	 * 设置：产品编码
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * 设置：商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品副标题
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * 获取：商品副标题
	 */
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * 设置：商品文描
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：商品文描
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：h5商品文描
	 */
	public void setMdescription(String mdescription) {
		this.mdescription = mdescription;
	}
	/**
	 * 获取：h5商品文描
	 */
	public String getMdescription() {
		return mdescription;
	}
	/**
	 * 获取：产品编码
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * 设置：商品条形码
	 */
	public void setEan(String ean) {
		this.ean = ean;
	}
	/**
	 * 获取：商品条形码
	 */
	public String getEan() {
		return ean;
	}
	/**
	 * 设置：商品类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：商品类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：品牌
	 */
	public void setBrand(Long brand) {
		this.brand = brand;
	}
	/**
	 * 获取：品牌
	 */
	public Long getBrand() {
		return brand;
	}
	/**
	 * 设置：单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：产地
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * 获取：产地
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * 设置：重量(克)
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	/**
	 * 获取：重量(克)
	 */
	public Integer getWeight() {
		return weight;
	}
	/**
	 * 设置：规格
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	/**
	 * 获取：规格
	 */
	public String getSpecification() {
		return specification;
	}
	/**
	 * 设置：销项税率(%)
	 */
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	/**
	 * 获取：销项税率(%)
	 */
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	/**
	 * 设置：保质期
	 */
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}
	/**
	 * 获取：保质期
	 */
	public String getShelfLife() {
		return shelfLife;
	}
	/**
	 * 设置：指导价格
	 */
	public void setGuidingPrice(BigDecimal guidingPrice) {
		this.guidingPrice = guidingPrice;
	}
	/**
	 * 获取：指导价格
	 */
	public BigDecimal getGuidingPrice() {
		return guidingPrice;
	}
	/**
	 * 设置：母品
	 */
	public void setBaseProduct(String baseProduct) {
		this.baseProduct = baseProduct;
	}
	/**
	 * 获取：母品
	 */
	public String getBaseProduct() {
		return baseProduct;
	}
	/**
	 * 设置：属性
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}
	/**
	 * 获取：属性
	 */
	public String getField1() {
		return field1;
	}
	/**
	 * 设置：属性取值
	 */
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	/**
	 * 获取：属性取值
	 */
	public String getValue1() {
		return value1;
	}
	/**
	 * 设置：属性
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}
	/**
	 * 获取：属性
	 */
	public String getField2() {
		return field2;
	}
	/**
	 * 设置：属性取值
	 */
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	/**
	 * 获取：属性取值
	 */
	public String getValue2() {
		return value2;
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
	/**
	 * 设置：长(单位:mm)
	 */
	public void setLength(Integer length) {
		this.length = length;
	}
	/**
	 * 获取：长(单位:mm)
	 */
	public Integer getLength() {
		return length;
	}
	/**
	 * 设置：宽(单位:mm)
	 */
	public void setWide(Integer wide) {
		this.wide = wide;
	}
	/**
	 * 获取：宽(单位:mm)
	 */
	public Integer getWide() {
		return wide;
	}
	/**
	 * 设置：高(单位:mm)
	 */
	public void setHigh(Integer high) {
		this.high = high;
	}
	/**
	 * 获取：高(单位:mm)
	 */
	public Integer getHigh() {
		return high;
	}
	/**
	 * 设置：
	 */
	public void setEncodeStr(String encodeStr) {
		this.encodeStr = encodeStr;
	}
	/**
	 * 获取：
	 */
	public String getEncodeStr() {
		return encodeStr;
	}
	/**
	 * 设置：版本控制
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：版本控制
	 */
	public Integer getVersion() {
		return version;
	}
	/**
	 * 设置：库存分配方式
	 */
	public void setStockShareType(String stockShareType) {
		this.stockShareType = stockShareType;
	}
	/**
	 * 获取：库存分配方式
	 */
	public String getStockShareType() {
		return stockShareType;
	}

	public Integer getShareStock() {
		return shareStock;
	}

	public void setShareStock(Integer shareStock) {
		this.shareStock = shareStock;
	}

	public List<ProductChannel> getProductChannels() {
		return productChannels;
	}
	public void setProductChannels(List<ProductChannel> productChannels) {
		this.productChannels = productChannels;
	}
	public List<Productlp> getProductlps() {
		return productlps;
	}
	public void setProductlps(List<Productlp> productlps) {
		this.productlps = productlps;
	}
}
