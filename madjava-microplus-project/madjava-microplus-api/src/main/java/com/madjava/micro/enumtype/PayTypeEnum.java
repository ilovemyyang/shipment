package com.madjava.micro.enumtype;

/**
 *  支付类型枚举类
 * @author eddy.wanlei.liu
 *
 */
public enum PayTypeEnum {

	APP_PAY("APP_PAY", "APP发起支付"),
	MWEB_PAY("MWEB_PAY", "手机浏览器发起支付"),
	WMALL("WMALL", "微信内置浏览器支付"),
	WEB("WEB", "网页端支付");
	
	private String code;
	
	private String name;

	private PayTypeEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}
