package com.madjava.micro.dto.baseservice;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class ChannellpData implements Serializable{
	private static final long serialVersionUID = -3487461766823542928L;

	@ApiModelProperty(value = "Channellp主键, update操作必填", example = "JDGT", required = false)
    private String pk;

	@ApiModelProperty(value = "渠道编码", example = "JDGT", required = true)
    private String channelCode;

	@ApiModelProperty(value = "语言编码", example = "zh_CN", required = true)
    private String langCode;

	@ApiModelProperty(value = "渠道名", example = "京东", required = true)
    private String name;

	@ApiModelProperty(value = "创建人", example = "admin", required = true)
    private String createBy;

	@ApiModelProperty(value = "更新人", example = "admin", required = true)
    private String updateBy;
}
