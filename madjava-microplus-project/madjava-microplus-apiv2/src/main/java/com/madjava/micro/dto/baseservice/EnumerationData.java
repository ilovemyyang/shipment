package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.List;

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
public class EnumerationData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<EnumerationValueData> enumerationValueData;
    
    //枚举类型
	private String enumType;
    
}
