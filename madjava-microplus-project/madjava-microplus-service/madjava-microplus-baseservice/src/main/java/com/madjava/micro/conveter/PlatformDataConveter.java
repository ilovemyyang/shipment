package com.madjava.micro.conveter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.PlatformData;
import com.madjava.micro.dto.util.AbstractConverter;
import com.madjava.micro.model.baseservice.Platform;


@Component("platformDataConverter")
public class PlatformDataConveter extends AbstractConverter<Platform,PlatformData>{

	@Override
	public PlatformData convertToData(Platform entity) {
		PlatformData platformData = new PlatformData();
		platformData.setId(entity.getId());
		platformData.setCode(entity.getCode());
		return platformData;
	}

	@Override
	public Platform convert(PlatformData data) {
		final Platform entity = new Platform();
		entity.setId(data.getId());
		entity.setCode(data.getCode());
		entity.setName(StringUtils.EMPTY);
		return entity;
	}
}
