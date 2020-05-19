package com.madjava.micro.config;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.google.gson.Gson;
import com.madjava.micro.constant.CommonConstants;
import com.madjava.micro.dto.baseservice.BasesiteData;
import com.madjava.micro.facade.baseservice.BaseServiceFacade;
import com.madjava.micro.facade.enumvalue.EnumerationFacade;


@Configuration
public class InitConfiguration
{

	@Autowired
	BaseServiceFacade baseServiceFacade;
	
	@Autowired
	EnumerationFacade enumValueFacade;

	@Autowired
	private StringRedisTemplate redisTemplate;

	@PostConstruct
	public void doInit()
	{
		Gson gson = new Gson();

		final List<BasesiteData> site_list = this.baseServiceFacade.selectAllBasesiteData();
		this.redisTemplate.delete(CommonConstants.REDIS_SITE_KEY);
		for (final BasesiteData basesite : site_list)
		{
			//set sites to redis
			this.redisTemplate.opsForHash().put(CommonConstants.REDIS_SITE_KEY, basesite.getSiteCode(), gson.toJson(basesite));
		}
		if(!this.redisTemplate.hasKey(CommonConstants.REDIS_ENUM_KEY))
		{
			enumValueFacade.initializeData();
		}
		
	}



}
