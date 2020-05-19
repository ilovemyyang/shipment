package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * 
 * 
 * @author zhuoxing.yan
 * @email zhuoxing.yan@accenture.com
 * @date 2020-03-22 16:44:03
 */
@Data
@ApiModel
public class BasesiteData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
    private Integer id;
	
    private String siteCode;
	
    private Boolean isActive;
	
    private String defaultLanguage;
	
    private String defaultCurrency;
	
    private Date createTime;
	
    private Date modifyTime;

}
