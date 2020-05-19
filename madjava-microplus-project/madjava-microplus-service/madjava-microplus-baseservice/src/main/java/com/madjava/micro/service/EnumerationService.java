package com.madjava.micro.service;

import java.util.List;

import com.madjava.micro.dto.baseservice.EnumerationData;
import com.madjava.micro.dto.baseservice.EnumerationValueData;

/**
 * 
 *
 * @author yibin.lu
 * @email yibin.lu@accenture.com
 * @date 2020-03-30
 */
public interface EnumerationService  {

	List<EnumerationData> findListAll();

	List<EnumerationValueData> findList(EnumerationValueData enumvalue);

	void saveList(List<EnumerationValueData> enumvalues);

	void updateList(String key, List<EnumerationValueData> list);
}