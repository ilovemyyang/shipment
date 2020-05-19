package com.madjava.micro.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;

@Data
public abstract class BaseEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 904390881540493766L;

	/**
     * 创建日期
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;
	/**
     * 修改时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    
    /**
     * 创建人
     */
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    private String createUser;
    
    /**
     * 修改人
     */
    @TableField(value = "update_user", fill = FieldFill.INSERT_UPDATE)
    private String updateUser;
    
    /**
     * 逻辑删除标识
     */
    @TableLogic
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private Integer deleted = 0;
    
    /**
     * 版本号
     */
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version = 1;
    
	
    /**
     * 租户编码
     */
    @TableField(value = "tenant_code", fill = FieldFill.INSERT)
	private String tenantCode;
    
}
