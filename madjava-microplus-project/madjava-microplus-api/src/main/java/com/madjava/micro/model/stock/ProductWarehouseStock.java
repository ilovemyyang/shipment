package com.madjava.micro.model.stock;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * @author zhuoxing.yan
 * @email zhuoxing.yan@accenture.com
 * @date 2020-03-21 17:00:03
 */
@Table(name = "product_warehouse_stock")
public class ProductWarehouseStock implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    public static final String _ID = "id";
	
	    //商品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //商品名称
    public static final String _PRODUCTNAME = "productName";
	
	    //仓库编码
    public static final String _WAREHOUSECODE = "warehouseCode";
	
	    //仓库商品编码
    public static final String _WAREHOUSEPRODUCTCODE = "warehouseProductCode";
	
	    //是否启用
    public static final String _ENABLE = "enable";
	
	    //库存数量
    public static final String _QUANTITY = "quantity";
	
	    //占用库存数
    public static final String _RESERVEQUANTITY = "reserveQuantity";
	
	    //
    public static final String _FLAGSPECIAL = "flagSpecial";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //修改时间
    public static final String _MODIFYTIME = "modifyTime";
	
	
	    //
    @Id
    private Long id;
	
	    //商品编码
    @Column(name = "product_code")
    private String productCode;
	
	    //商品名称
    @Column(name = "product_name")
    private String productName;
	
	    //仓库编码
    @Column(name = "warehouse_code")
    private String warehouseCode;
	
	    //仓库商品编码
    @Column(name = "warehouse_product_code")
    private String warehouseProductCode;
	
	    //是否启用
    @Column(name = "enable")
    private Boolean enable;
	
	    //库存数量
    @Column(name = "quantity")
    private Integer quantity;
	
	    //占用库存数
    @Column(name = "reserve_quantity")
    private Integer reserveQuantity;
	
	    //
    @Column(name = "flag_special")
    private Boolean flagSpecial;
	
	    //创建时间
    @Column(name = "create_time")
    private Date createTime;
	
	    //修改时间
    @Column(name = "modify_time")
    private Date modifyTime;
	

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
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
	 * 设置：商品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：商品名称
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：仓库编码
	 */
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	/**
	 * 获取：仓库编码
	 */
	public String getWarehouseCode() {
		return warehouseCode;
	}
	/**
	 * 设置：仓库商品编码
	 */
	public void setWarehouseProductCode(String warehouseProductCode) {
		this.warehouseProductCode = warehouseProductCode;
	}
	/**
	 * 获取：仓库商品编码
	 */
	public String getWarehouseProductCode() {
		return warehouseProductCode;
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
	 * 设置：库存数量
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 获取：库存数量
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 设置：占用库存数
	 */
	public void setReserveQuantity(Integer reserveQuantity) {
		this.reserveQuantity = reserveQuantity;
	}
	/**
	 * 获取：占用库存数
	 */
	public Integer getReserveQuantity() {
		return reserveQuantity;
	}
	/**
	 * 设置：
	 */
	public void setFlagSpecial(Boolean flagSpecial) {
		this.flagSpecial = flagSpecial;
	}
	/**
	 * 获取：
	 */
	public Boolean getFlagSpecial() {
		return flagSpecial;
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
	 * 设置：修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
}
