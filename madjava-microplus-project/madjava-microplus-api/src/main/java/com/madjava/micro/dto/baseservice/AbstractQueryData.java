package com.madjava.micro.dto.baseservice;


import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel
@Data
public abstract class AbstractQueryData implements ItemData {

	private static final long serialVersionUID = -846509478438479932L;
	
	@ApiModelProperty(value = "第几页", example = "1", position = 100)
	private Integer pageNo = 1;
	@ApiModelProperty(value = "每页记录数", example = "20",  position = 100)
	private Integer fetchSize = 50;
	@ApiModelProperty(value = "排序字段", example = "100001",  position = 100)
	private String orderByColumn = "creation_time";
	@ApiModelProperty(value = "升序/降序", example = "ASC/DESC",  position = 100)
	private String sort = "DESC";
	@ApiModelProperty(value = "是否列表页", example = "true/false",  position = 100)
	private Boolean isListPage = Boolean.FALSE;

}
