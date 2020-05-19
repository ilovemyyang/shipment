package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

//import com.madjava.micro.model.baseservice.Channellp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ChannelData implements Serializable {

	private static final long serialVersionUID = -5299787540339634213L;

	@ApiModelProperty(value = "渠道id，update操作必填,创建不填写", example = "JDGT", required = false)
	 private String id;
	 
	@ApiModelProperty(value = "渠道编码，必填", example = "JDGT", required = true)
	private String code;
	
	@ApiModelProperty(value = "渠道名称，必填", example = "XXX", required = false)
	private String name;
	
	@ApiModelProperty(value = "渠道的图标", example = "", required = false)
	private String icon;
	
	@ApiModelProperty(value = "渠道名字的国际化字段", required = false)
	private List<ChannellpData> channellps;
	
	@NotNull(message="是否启用，必填")
	@ApiModelProperty(value = "是否启用，必填", example = "false", required = true)
	private Boolean enabled;
	
	@NotNull(message="平台ID，必填")
	@ApiModelProperty(value = "平台ID，必填", required = true)
	private Long platformId;
	
	@ApiModelProperty(value = "平台编码，创建修改不需要入参", required = false)
	private String platformCode;
	
	@ApiModelProperty(value = "平台中文描述，创建修改不需要入参", required = false)
	private String platformName;

	public ChannelData() {
	}

	public ChannelData(String code,  Boolean enabled, Long platformId) {
		this.code = code;
		this.enabled = enabled;
		this.platformId = platformId;
	}

}
