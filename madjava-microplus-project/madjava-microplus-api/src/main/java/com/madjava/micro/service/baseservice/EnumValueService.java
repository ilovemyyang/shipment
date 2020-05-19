package com.madjava.micro.service.baseservice;

import java.util.List;

import com.madjava.micro.model.baseservice.EnumValue;
import com.madjava.micro.service.base.BaseService;

/**
 * 
 *
 * @author yibin.lu
 * @email yibin.lu@accenture.com
 * @date 2020-03-30
 */
public interface EnumValueService extends BaseService<EnumValue> {

	List<EnumValue> findListAll();

	List<EnumValue> findList(List<EnumValue> list, EnumValue enumvalue);

	void saveList(List<EnumValue> enumvalues);
}