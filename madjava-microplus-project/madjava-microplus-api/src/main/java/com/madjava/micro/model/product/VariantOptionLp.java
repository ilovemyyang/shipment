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
@Table(name = "variant_option_lp")
public class VariantOptionLp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    public static final String _PK = "pk";
	
	    //属性pk
    public static final String _VARIANTOPTIONPK = "variantOptionPk";
	
	    //语言code
    public static final String _LANGCODE = "langCode";
	
	    //名称国际化字段
    public static final String _NAME = "name";
	
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
	
	    //属性pk
    @Column(name = "variant_option_pk")
    private String variantOptionPk;
	
	    //语言code
    @Column(name = "lang_code")
    private String langCode;
	
	    //名称国际化字段
    @Column(name = "name")
    private String name;
	
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
	 * 设置：属性pk
	 */
	public void setVariantOptionPk(String variantOptionPk) {
		this.variantOptionPk = variantOptionPk;
	}
	/**
	 * 获取：属性pk
	 */
	public String getVariantOptionPk() {
		return variantOptionPk;
	}
	/**
	 * 设置：语言code
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	/**
	 * 获取：语言code
	 */
	public String getLangCode() {
		return langCode;
	}
	/**
	 * 设置：名称国际化字段
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名称国际化字段
	 */
	public String getName() {
		return name;
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
