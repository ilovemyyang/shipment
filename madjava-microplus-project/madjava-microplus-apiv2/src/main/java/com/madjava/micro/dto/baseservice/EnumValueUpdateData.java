package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="枚举值修改实体类")
public class EnumValueUpdateData implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@ApiModelProperty(value = "枚举编号",dataType="String", example = "created", required = true)
	private String code;
	
	@ApiModelProperty(value = "枚举类型",dataType="String", example = "orderstatus", required = true)
	private String enumType;
	
	@ApiModelProperty(value = "语言编码",dataType="String", example = "zh_CN", required = true)
	private String langCode;
	
	@ApiModelProperty(value = "名称",dataType="String", example = "已创建", required = false)
	private String name;
	
	@ApiModelProperty(value = "是否禁用",dataType="Boolean", example = "false", required = false)
	private Boolean disabled;
	
	@ApiModelProperty(value = "修改时间",dataType="Date",example = "2020-03-30 10:24:09", required = false)
	private Date updateTime;

	@ApiModelProperty(value = "更新人",dataType="String",example = "yibin.lu", required = false)
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

}
