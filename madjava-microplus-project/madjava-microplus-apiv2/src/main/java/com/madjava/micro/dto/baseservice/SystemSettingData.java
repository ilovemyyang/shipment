package com.madjava.micro.dto.baseservice;

import com.madjava.micro.dto.BaseData;

import lombok.Data;

/**
 * @Classname SystemSettingData
 * @Description 数据转换层
 * @Date 2020-05-14 15:18:34
 * @Created by yibin.lu
 */
@Data
public class SystemSettingData extends BaseData {

	private static final long serialVersionUID = -3865132187991774211L;


	
	/**
	 * 主键
	 */
	private String id;
	
	
	/**
	 * 编码
	 */
	private String configCode;
	
	
	/**
	 * 名称
	 */
	private String configName;
	
	
	/**
	 * 值
	 */
	private String configValue;
	
	
	
	
	
	
}
