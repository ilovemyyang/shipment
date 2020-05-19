package com.madjava.micro.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
public class SortRequestData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5624635783475410749L;
	
	@ApiModelProperty(value = "排序字段", example = "create_time")
	private String fieldName;
	
	@ApiModelProperty(value = "排序(ASC/DESC)", example = "ASC")
	private String operation = "ASC";

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
