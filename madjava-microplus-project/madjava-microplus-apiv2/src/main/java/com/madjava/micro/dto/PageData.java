package com.madjava.micro.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(description = "分页查询Data")
@Data
public class PageData<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7800424481003141357L;

	/**
	 *  页码
	 *  从0开始
	 */
	@ApiModelProperty(value = "页码，从0开始", dataType = "int", example = "0")
	private long pageNo;
	
	/**
	 *  每页的最大记录数
	 *  默认20条
	 */
	@ApiModelProperty(value = "每页的最大记录数,默认20条", dataType = "int", example = "10")
	private long pageSize = 20;
	
	/**
	 * 总数
	 */
	@ApiModelProperty(value = "总条数", dataType = "int", example = "100")
	private long total;
	
}
