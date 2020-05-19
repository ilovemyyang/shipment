package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2019-12-30 10:36:04
 */
@Table(name = "productlp")
public class Productlp implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//主键
    public static final String _PK = "pk";
	
	    //商品编码
    public static final String _PRODUCTCODE = "productCode";
	
	    //语言编码
    public static final String _LANGCODE = "langCode";
	
	    //商品名称
    public static final String _NAME = "name";
	
	    //商品副标题
    public static final String _SUBTITLE = "subtitle";
	
	    //商品文描
    public static final String _DESCRIPTION = "description";
	
	    //h5商品文描
    public static final String _MDESCRIPTION = "mdescription";
	
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
	
	    //语言编码
    @Column(name = "lang_code")
    private String langCode;
	
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
	 * 设置：语言编码
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	/**
	 * 获取：语言编码
	 */
	public String getLangCode() {
		return langCode;
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
