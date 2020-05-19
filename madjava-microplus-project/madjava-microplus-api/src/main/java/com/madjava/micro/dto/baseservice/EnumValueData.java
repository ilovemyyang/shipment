package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description="枚举值实体类")
public class EnumValueData implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pk;
	
	@ApiModelProperty(value = "枚举编号",dataType="String", example = "created", required = true)
	private String code;
	
	@ApiModelProperty(value = "枚举类型",dataType="String", example = "orderstatus", required = true)
	private String enumType;
	
	@ApiModelProperty(value = "语言编码",dataType="String", example = "zh_CN", required = true)
	private String langCode;
	
	@ApiModelProperty(value = "名称",dataType="String", example = "created", required = false)
	private String name;
	
	@ApiModelProperty(value = "是否禁用",dataType="Boolean", example = "false", required = false)
	private Boolean disabled;
	
	private Date createTime;
	
	private String createBy;
	
	@ApiModelProperty(value = "修改时间",dataType="Date",example = "2020-03-30 10:24:09", required = false)
	private Date updateTime;

	@ApiModelProperty(value = "更新人",dataType="String", required = false)
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

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}
}
