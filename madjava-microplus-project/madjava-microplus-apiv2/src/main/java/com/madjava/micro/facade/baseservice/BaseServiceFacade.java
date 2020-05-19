package com.madjava.micro.facade.baseservice;

import java.util.Collection;
import java.util.List;

import com.madjava.micro.dto.baseservice.BasesiteData;
import com.madjava.micro.dto.baseservice.ChannelData;
import com.madjava.micro.dto.baseservice.PlatformData;

public interface BaseServiceFacade {

	void createPlatform(final PlatformData platformData);
	
	void deletePlatformByIds(final Collection<String> ids);
	
	void updatePlatformById(PlatformData platformData);
	
	PlatformData selectPlatformById(final String id);
	
	ChannelData selectChannelForPlatformById(String platformId,String channelCode);
	
	List<PlatformData> selectPlatformDatas();
	
	void createBasesite(final BasesiteData basesiteData);
	
	void deleteBasesiteByIds(final Collection<String> ids);
	
	void updateBasesiteById(BasesiteData basesiteData);
	
	BasesiteData selectBasesiteByCode(String siteCode);
	
	List<BasesiteData> selectAllBasesiteData();
	
	List<ChannelData>  getChannelDatasForCurrentLanguage();
	
	ChannelData getChannelByCodeForCurrentLanguage(String channelCode);
}
