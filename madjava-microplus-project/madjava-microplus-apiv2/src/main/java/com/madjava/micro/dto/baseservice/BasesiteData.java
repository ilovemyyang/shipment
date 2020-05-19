package com.madjava.micro.dto.baseservice;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 
 * 
 * @author zhuoxing.yan
 * @email zhuoxing.yan@accenture.com
 * @date 2020-03-22 16:44:03
 */
@Data
@ApiModel
public class BasesiteData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "站点id，update操作必填", example = "123", required = false)
    private String id;
	
	@ApiModelProperty(value = "站点 code，必填", example = "123", required = true)
    private String siteCode;
	
	@ApiModelProperty(value = "", example = "true", required = false)
    private Boolean isActive;
	
	@ApiModelProperty(value = "默认语言", example = "zh_CN", required = false)
    private String defaultLanguage;
	
	@ApiModelProperty(value = "默认货币", example = "CNY", required = false)
    private String defaultCurrency;
}
