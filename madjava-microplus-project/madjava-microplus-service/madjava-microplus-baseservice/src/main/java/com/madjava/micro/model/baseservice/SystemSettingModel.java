package com.madjava.micro.model.baseservice;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.madjava.micro.model.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @Classname SystemSettingModel
 * @Description  实体类
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
@Data
@TableName("system_setting")
public class SystemSettingModel extends BaseEntity {
	private static final long serialVersionUID = -428719682937489215L;


	/**
	 * 主键
	 */
	@TableId(value = "id",type = IdType.ASSIGN_ID)
	private String id;

	/**
	 * 编码
	 */
	@TableField("config_code")
	private String configCode;

	/**
	 * 名称
	 */
	@TableField("config_name")
	private String configName;

	/**
	 * 值
	 */
	@TableField("config_value")
	private String configValue;






}
