package com.madjava.micro.service.config;

import com.madjava.micro.dto.PagingData;
import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.WebserviceData;

/**
 *  中间件webservice
 *  访问接口
 *  放在config服务中
 * @author sheng.han
 *
 */
public interface WebserviceService {

	public PagingData<WebserviceData> get(Integer pageNum, Integer pageLimit, Byte status);
	
	public ResultData retry(String interfaceName, String businessKey);
}
