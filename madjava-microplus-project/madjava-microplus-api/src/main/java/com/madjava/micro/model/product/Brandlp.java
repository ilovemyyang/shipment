package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 
 * @author eddy.wanlei.liu
 * @email eddy.wanlei.liu@accenture.com
 * @date 2020-04-13 17:22:02
 */
@Table(name = "brandlp")
public class Brandlp implements Serializable {
	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	private static final long serialVersionUID = 1L;

	// 主键
	public static final String _PK = "pk";

	// 品牌编码
	public static final String _CATEGORYCODE = "brandCode";

	// 语言编码
	public static final String _LANGCODE = "langCode";

	// 品牌名称
	public static final String _NAME = "name";

	// 创建时间
	public static final String _CREATETIME = "createTime";

	// 创建人
	public static final String _CREATEBY = "createBy";

	// 修改时间
	public static final String _UPDATETIME = "updateTime";

	// 更新人
	public static final String _UPDATEBY = "updateBy";

	// 主键
	@Id
	private String pk;

	// 品牌编码
	@Column(name = "brand_code")
	private String brandCode;

	// 语言编码
	@Column(name = "lang_code")
	private String langCode;

	// 品牌名称
	@Column(name = "name")
	private String name;

	// 创建时间
	@Column(name = "create_time")
	private Date createTime;

	// 创建人
	@Column(name = "create_by")
	private String createBy;

	// 修改时间
	@Column(name = "update_time")
	private Date updateTime;

	// 更新人
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
	 * 设置：品牌编码
	 */

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
	 * 设置：品牌名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取：品牌名称
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
