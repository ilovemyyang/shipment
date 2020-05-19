package com.madjava.micro.service.config;

import com.madjava.micro.dto.ResultData;
import com.madjava.micro.enumtype.SmsTemplateEnum;

/**
 * 代理类
 * @author sheng.han
 *
 */
public interface SendSmsDelegateService {

	/**
	 * 发送短信代理类核心方法
	 * @param mobile
	 * @param mode
	 * @param userType
	 * @param params
	 * @return
	 */
	ResultData<String> sendSmsCode(String mobile, SmsTemplateEnum mode, String param);
	
	/**
	 *  短信验证码验证
	 * @param mobile
	 * @param smsCode
	 * @param userType
	 * @return
	 */
	ResultData<String> validateSmsCode(String mobile, String smsCode, Integer userType);
}
