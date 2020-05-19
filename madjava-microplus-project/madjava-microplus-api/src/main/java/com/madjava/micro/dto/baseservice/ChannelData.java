package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.madjava.micro.model.baseservice.Channellp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ChannelData implements Serializable {

	private static final long serialVersionUID = -5299787540339634213L;

	@ApiModelProperty(value = "渠道编码，必填", example = "wmall/app", required = true)
	private String code;
	
	@NotNull(message="是否启用，必填")
	@ApiModelProperty(value = "是否启用，必填", example = "false", required = true)
	private Boolean enabled;
	
	@NotNull(message="平台ID，必填")
	@ApiModelProperty(value = "平台ID，必填", required = true)
	private Long platformId;
	
	@ApiModelProperty(value = "渠道的国际化字段", required = false)
	private List<Channellp> channellps;
	
	@ApiModelProperty(value = "平台编码，创建修改不需要入参", required = false)
	private String platformCode;
	
	@ApiModelProperty(value = "平台中文描述，创建修改不需要入参", required = false)
	private String platformName;

	public ChannelData() {
	}

	public ChannelData(String code, Boolean enabled, Long platformId) {
		this.code = code;
		this.enabled = enabled;
		this.platformId = platformId;
	}

}
