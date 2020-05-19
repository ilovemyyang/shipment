package com.madjava.micro.facade.enumvalue;

import java.util.List;

import com.madjava.micro.dto.baseservice.EnumValueData;
import com.madjava.micro.dto.baseservice.EnumValueUpdateData;


public interface EnumValueFacade 
{

	List<EnumValueData> getEnumValueDatasByTypeAndLanguage(String enumType, String langCode);

	List<EnumValueData> findAll();

	void update(EnumValueUpdateData entity);

	void initializeData();

}
