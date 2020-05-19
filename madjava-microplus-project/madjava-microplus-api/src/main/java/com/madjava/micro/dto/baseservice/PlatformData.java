package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.List;

import com.madjava.micro.model.baseservice.Platformlp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class PlatformData implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1762934495278957732L;

	@ApiModelProperty(value = "平台ID，必填", example = "295637883243", required = true)
	private String id;
	
	@ApiModelProperty(value = "平台编码，必填", example = "264573456879", required = true)
	private String code;
	
	@ApiModelProperty(value = "平台名称，必填", example = "World Dream", required = true)
	private String name;
	
	@ApiModelProperty(value = "平台对应的国际化字段", required = false)
	private List<Platformlp> Platformlps;
	
	@ApiModelProperty(value = "平台下的渠道", required = false)
	private List<ChannelData> ChannelDatas;


	
}
