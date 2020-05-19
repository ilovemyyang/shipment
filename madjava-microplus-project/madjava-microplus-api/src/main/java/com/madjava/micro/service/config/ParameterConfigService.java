package com.madjava.micro.service.config;

import java.util.List;

import com.madjava.micro.model.config.ParameterConfig;

/**
 * 动态参数
 * 
 * @author yuxiao.wang
 *
 */
public interface ParameterConfigService {

	public List<String> getValues(String key);
	
	public int updateByKey(ParameterConfig parameterConfig);
	
	/**
	 *  根据key获取val
	 * @param key
	 * @return
	 */
	public String getValue(String key);
}
