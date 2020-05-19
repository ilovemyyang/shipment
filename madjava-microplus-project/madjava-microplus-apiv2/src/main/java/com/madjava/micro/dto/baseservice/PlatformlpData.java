package com.madjava.micro.dto.baseservice;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PlatformlpData implements Serializable {
	private static final long serialVersionUID = 2605520948254142238L;
	
	@ApiModelProperty(value = "Platformlp的主键", example = "123456", required = true)
	private String pk;
	
	@ApiModelProperty(value = "Platform的主键", example = "123456", required = true)
	private String platformPk;

	@ApiModelProperty(value = "Platform对应语言下的名字", example = "123456", required = true)
	private String name;
	
	@ApiModelProperty(value = "语言编码", example = "zh_CN", required = true)
	private String langCode;
}
