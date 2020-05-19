package com.madjava.micro.model.baseservice;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;


/**
 * 
 * 
 * @author yibin.lu
 * @email  yibin.lu@accenture.com
 * @date 2020-03-30
 */
@Table(name = "enumvalue")
public class EnumValue implements Serializable {
	private static final long serialVersionUID = 1L;
	
    //主键
	@Id
	private String id;
	
    //枚举编号
    @Column(name = "code")
    private String code;
    
    //枚举类型
	@Column(name = "enum_type")
	private String enumType;
	
    //语言编码
	@Column(name = "lang_code")
	private String langCode;
	
    //名称
    @Column(name = "name")
    private String name;
    
    //是否禁用
    @Column(name = "disabled")
    private Boolean disabled;
	
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEnumType() {
		return enumType;
	}

	public void setEnumType(String enumType) {
		this.enumType = enumType;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
