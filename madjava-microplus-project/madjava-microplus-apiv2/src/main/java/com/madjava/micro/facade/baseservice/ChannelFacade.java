package com.madjava.micro.facade.baseservice;

import java.util.Collection;
import java.util.List;

import com.madjava.micro.dto.baseservice.ChannelData;

public interface ChannelFacade {
	ChannelData selectById(final String id);
	List<ChannelData> listChannelsByCodes(List<String> channelCodes);
	List<ChannelData> listAll();
	void createChannel(final ChannelData channelData);
	void updateById(final ChannelData channelData);
	void deleteByIds(final Collection<String> ids);
}
