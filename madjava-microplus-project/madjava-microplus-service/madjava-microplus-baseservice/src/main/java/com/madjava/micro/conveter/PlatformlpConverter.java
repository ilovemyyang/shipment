package com.madjava.micro.conveter;

import org.springframework.stereotype.Component;

import com.madjava.micro.dto.baseservice.PlatformlpData;
import com.madjava.micro.dto.util.AbstractConverter;
import com.madjava.micro.model.baseservice.Platformlp;

@Component
public class PlatformlpConverter extends AbstractConverter<Platformlp,PlatformlpData>{

	@Override
	public PlatformlpData convertToData(Platformlp entity) {
		final PlatformlpData data = new PlatformlpData();
		data.setPk(entity.getPk());
		data.setPlatformPk(entity.getPlatformPk());
		data.setName(entity.getName());
		data.setLangCode(entity.getLangCode());
		return data;
	}

	@Override
	public Platformlp convert(PlatformlpData data) {
		final Platformlp entity = new Platformlp();
		entity.setPk(data.getPk());
		entity.setLangCode(data.getLangCode());
		entity.setName(data.getName());
		entity.setPlatformPk(data.getPlatformPk());
		return entity;
	}

}
