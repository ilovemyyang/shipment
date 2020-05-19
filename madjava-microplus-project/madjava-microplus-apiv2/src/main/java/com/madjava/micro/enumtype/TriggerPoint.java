package com.madjava.micro.enumtype;


/**
 *
 */
public enum TriggerPoint
{
	PRODUCT("PRODUCT","产品级"), 
	CART("CART","购物车级"), 
	ORDER("ORDER","订单级");
	
	private String code;
	
	private String message;

	private TriggerPoint(String code ,String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
