package com.madjava.micro.conveter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.ChannelData;
import com.madjava.micro.dto.util.AbstractConverter;
import com.madjava.micro.model.baseservice.Channel;


@Component("channelDataContever")
public class ChannelDataConveter  extends AbstractConverter<Channel,ChannelData>{
	

	@Override
	public ChannelData convertToData(Channel entity) {
		ChannelData channelData  = new ChannelData();
		channelData.setId(entity.getId());
		channelData.setCode(entity.getCode());
		channelData.setEnabled(entity.getEnabled());
		channelData.setPlatformId(entity.getPlatformId());
		channelData.setIcon(entity.getIcon());
		//channelData.setPlatformName(source.get); TODO baseservice
		return channelData;
	}

	@Override
	public Channel convert(ChannelData data) {
		final Channel entity = new Channel();
		entity.setId(data.getId());
		entity.setCode(data.getCode());
		entity.setIcon(data.getIcon());
		entity.setEnabled(data.getEnabled());
		entity.setPlatformId(data.getPlatformId());
		entity.setName(StringUtils.EMPTY);
		return entity;
	}

}
