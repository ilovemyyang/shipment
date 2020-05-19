package com.madjava.micro.service.baseservice;

import com.madjava.micro.model.baseservice.Basesite;
import com.madjava.micro.service.base.BaseService;

/**
 * 
 *
 * @author zhuoxing.yan
 * @email zhuoxing.yan@accenture.com
 * @date 2020-03-22 16:44:03
 */
public interface BasesiteService extends BaseService<Basesite> {
	
	Basesite getBasesiteByCode(String code);
	
}