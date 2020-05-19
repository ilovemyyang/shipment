package com.madjava.micro.facade.enumvalue;

import java.util.List;

import com.madjava.micro.dto.baseservice.EnumValueUpdateData;
import com.madjava.micro.dto.baseservice.EnumerationData;
import com.madjava.micro.dto.baseservice.EnumerationValueData;


public interface EnumerationFacade 
{

	List<EnumerationValueData> getEnumValueDatasByTypeAndLanguage(String enumType, String langCode);

	List<EnumerationData> findAll();

	void update(EnumValueUpdateData entity);

	void initializeData();

}
