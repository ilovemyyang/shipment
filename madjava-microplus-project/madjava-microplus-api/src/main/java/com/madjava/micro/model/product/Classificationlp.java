package com.madjava.micro.model.product;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 
 * 
 * @author shiheng.chu
 * @email shiheng.chu@accenture.com
 * @date 2020-04-15 17:27:29
 */
@Table(name = "classificationlp")
public class Classificationlp implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键
	public static final String _PK = "pk";

	// 类别编码
	public static final String _CLASSIFICATIONCODE = "classificationCode";

	//
	public static final String _LANGCODE = "langCode";

	// 类别值
	public static final String _VALUE = "value";

	// 类别值
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

	// 类别编码
	@Column(name = "classification_code")
	private String classificationCode;

	//
	@Column(name = "lang_code")
	private String langCode;

	//
	@Column(name = "value")
	private String value;

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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
	 * 设置：类别编码
	 */
	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	/**
	 * 获取：类别编码
	 */
	public String getClassificationCode() {
		return classificationCode;
	}

	/**
	 * 设置：
	 */
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	/**
	 * 获取：
	 */
	public String getLangCode() {
		return langCode;
	}

	/**
	 * 设置：
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 获取：
	 */
	public String getValue() {
		return value;
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
