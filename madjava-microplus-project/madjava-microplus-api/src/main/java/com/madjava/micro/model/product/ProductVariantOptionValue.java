package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-01-15 11:16:12
 */
@Table(name = "product_variant_option_value")
public class ProductVariantOptionValue implements Serializable {
	private static final long serialVersionUID = 1L;    
	
	    //主键
    public static final String _PK = "pk";
	
	    //商品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //属性值表pk
    public static final String _VARIANTOPTIONVALUEPK = "variantOptionValuePk";
	
	    //创建时间
    public static final String _CREATETIME = "createTime";
	
	    //创建人
    public static final String _CREATEBY = "createBy";
	
	    //修改时间
    public static final String _UPDATETIME = "updateTime";
	
	    //更新人
    public static final String _UPDATEBY = "updateBy";
    
    	//规格顺序
    public static final String _LEVEL = "level";
	
	
	    //主键
    @Id
    private String pk;
	
	    //商品编码
    @Column(name = "product_code")
    private String productCode;
	
	    //属性值表pk
    @Column(name = "variant_option_value_pk")
    private String variantOptionValuePk;
	
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
    
    	//规格顺序
    @Column(name = "level")
    private String level;
	
    /**
	 * 设置：规格顺序
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * 获取：主键
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * 设置：规格顺序
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
	 * 设置：属性值表pk
	 */
	public void setVariantOptionValuePk(String variantOptionValuePk) {
		this.variantOptionValuePk = variantOptionValuePk;
	}
	/**
	 * 获取：属性值表pk
	 */
	public String getVariantOptionValuePk() {
		return variantOptionValuePk;
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