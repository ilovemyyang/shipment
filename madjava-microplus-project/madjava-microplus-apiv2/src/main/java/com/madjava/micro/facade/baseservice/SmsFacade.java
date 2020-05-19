package com.madjava.micro.facade.baseservice;

import java.util.Map;

import com.madjava.micro.dto.ResultData;

public interface SmsFacade {

	ResultData<Boolean> sendSms(String phoneNum,String verificationCode);
	
	ResultData<Boolean> sendSmsCode(String phoneNum);
	
	boolean sendSms(String phoneNum,String templateId,Map<String,String> params);
	
	boolean sendAlertSms(String phoneNum,String message);
	
	boolean checkVerificationCode(String phoneNum,String verificationCode);
}
