package com.madjava.micro.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public abstract class BaseData implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 904390881540493766L;

	/**
     * 创建日期
     */
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "创建时间(创建/更新不需要)",required=false, example = "2020-05-14 00:00:00")
    private Date createTime;
	/**
     * 修改时间
     */
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "更新时间(创建/更新不需要)",required=false, example = "2020-05-14 00:00:00")
    private Date updateTime;
    
    /**
     * 创建人
     */
	@ApiModelProperty(value = "创建人(创建/更新不需要)",required=false, example = "admin")
    private String createUser;
    
    /**
     * 修改人
     */
	@ApiModelProperty(value = "修改人(创建/更新不需要)",required=false, example = "admin")
    private String updateUser;
	
	@ApiModelProperty(value = "租户ID",required=false, example = "shipment")
	private String tenantCode;
	
	@ApiModelProperty(value = "版本号",required=false, example = "1")
	private Integer version;
}
