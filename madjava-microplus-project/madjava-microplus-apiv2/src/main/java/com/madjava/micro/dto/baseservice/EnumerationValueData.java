package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * 
 * 
 * @author yibin.lu
 * @email  yibin.lu@accenture.com
 * @date 2020-03-30
 */
@Data
@ToString
@EqualsAndHashCode
public class EnumerationValueData implements Serializable {
	private static final long serialVersionUID = 1L;
	
    //主键
	private String id;
	
    //枚举编号
    private String code;
    
    //枚举类型
	private String enumType;
	
    //语言编码
	private String langCode;
	
    //名称
    private String name;
    
}
