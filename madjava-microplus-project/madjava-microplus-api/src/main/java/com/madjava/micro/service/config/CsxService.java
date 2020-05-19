package com.madjava.micro.service.config;

import com.madjava.micro.dto.config.CsxMobilePhoneRetrunData;

/**
 * 调用CSXservice层，暂时写到config中
 * 
 * @author eddy.wanlei.liu
 *
 */
public interface CsxService {
	
	public CsxMobilePhoneRetrunData getCsxMobilePhoneByLoginToken(String loginToken);
	
	/**
	 * 注册CSX用户（如果是未注册的手机号），并且登录返回Token
	 * 
	 * @param MobilePhone
	 * @return
	 */
	public String registerCsxUserAndLogin(final String MobilePhone);

}
