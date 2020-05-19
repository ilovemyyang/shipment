package com.madjava.micro.dto.baseservice;

import com.madjava.micro.dto.BaseData;

import lombok.Data;

/**
 * @Classname EnumvalueData
 * @Description 数据转换层
 * @Date 2020-05-14 17:29:42
 * @Created by zhuoxing.yan
 */
@Data
public class EnumvalueData extends BaseData {

	private static final long serialVersionUID = 2870805032706584682L;


	
	/**
	 * 
	 */
	private String id;
	
	
	/**
	 * 枚举类型
	 */
	private String enumType;
	
	
	/**
	 * 枚举编号
	 */
	private String code;
	
	
	/**
	 * 名称
	 */
	private String name;
	
	
	/**
	 * 排序号
	 */
	private Integer rankNo;
	
	
	/**
	 * 语言编码
	 */
	private String langCode;
	
	
	/**
	 * 是否禁用
	 */
	private Boolean disabled;
	
	
	
	
	
	
}
