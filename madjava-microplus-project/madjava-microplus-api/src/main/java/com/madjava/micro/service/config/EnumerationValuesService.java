package com.madjava.micro.service.config;

import com.madjava.micro.enumtype.AbstractEnum;
import com.madjava.micro.model.config.Enumerationvalues;

/**
 * 
 * @author eddy.wanlei.liu
 *
 */
public interface EnumerationValuesService {

	public String getPK(Enum<? extends AbstractEnum> abstractEnum);

	Enumerationvalues getEnumerationvalues(String pk);

}
