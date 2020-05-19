package com.madjava.micro.conveter;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.BasesiteData;
import com.madjava.micro.dto.util.AbstractConverter;
import com.madjava.micro.model.baseservice.Basesite;

@Component
public class BasesiteConverter extends AbstractConverter<Basesite, BasesiteData> {
	@Override
	public  BasesiteData convertToData(final Basesite entity ) {
		final BasesiteData data = new BasesiteData();
		data.setId(entity.getId());
		data.setIsActive(entity.getIsActive());
		data.setSiteCode(entity.getSiteCode());
		data.setDefaultCurrency(entity.getDefaultCurrency());
		data.setDefaultLanguage(entity.getDefaultLanguage());
		return data;
	}
	
	@Override
	public  Basesite convert(final BasesiteData data ) {
		final Basesite entity = new Basesite();
		entity.setId(data.getId());
		entity.setIsActive(data.getIsActive());
		entity.setSiteCode(data.getSiteCode());
		entity.setDefaultCurrency(data.getDefaultCurrency());
		entity.setDefaultLanguage(data.getDefaultLanguage());
		return entity;
	}
}
