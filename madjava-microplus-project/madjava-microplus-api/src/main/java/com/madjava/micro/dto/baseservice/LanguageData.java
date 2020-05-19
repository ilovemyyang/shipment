package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class LanguageData implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 293566046828935909L;
	
	@ApiModelProperty(value = "语言物理主键", example = "4545124842", required = true)
	private String pk;
	
	@ApiModelProperty(value = "语言编码", example = "ch", required = true)
	private String langCode;
	
	@ApiModelProperty(value = "语言名称", example = "中文", required = true)
	private String name;
	
	@ApiModelProperty(value = "创建时间", required = false)
	private Date createTime;
	
	@ApiModelProperty(value = "创建人", required = false)
	private String createBy;
	
	@ApiModelProperty(value = "修改时间", required = false)
	private Date updateTime;

	@ApiModelProperty(value = "更新人", required = false)
	private String updateBy;
}
