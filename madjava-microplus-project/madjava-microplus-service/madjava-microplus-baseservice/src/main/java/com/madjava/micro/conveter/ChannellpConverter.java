package com.madjava.micro.conveter;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.ChannellpData;
import com.madjava.micro.dto.util.AbstractConverter;
import com.madjava.micro.model.baseservice.Channellp;

@Component
public class ChannellpConverter extends AbstractConverter<Channellp,ChannellpData>{

	@Override
	public ChannellpData convertToData(Channellp entity) {
		final ChannellpData data = new ChannellpData();
		data.setPk(entity.getPk());
		data.setChannelCode(entity.getChannelCode());
		data.setLangCode(entity.getLangCode());
		data.setName(entity.getName());
		data.setCreateBy(entity.getCreateBy());
		data.setUpdateBy(entity.getUpdateBy());
		return data;
	}

	@Override
	public Channellp convert(ChannellpData data) {
		final Channellp entity = new Channellp();
		entity.setPk(data.getPk());
		entity.setChannelCode(data.getChannelCode());
		entity.setLangCode(data.getLangCode());
		entity.setName(data.getName());
		//TODO baseservice createby updateby
		return entity;
	}

}
