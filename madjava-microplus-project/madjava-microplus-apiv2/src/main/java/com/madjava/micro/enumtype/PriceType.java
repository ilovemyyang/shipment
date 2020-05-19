package com.madjava.micro.enumtype;


/**
 *
 */
public enum PriceType
{
	
	ERP_PRICE("ERP_PRICE","系统价格"), 
	SALES_PRICE("SALES_PRICE","销售价格");
	
	private String code;
	
	private String message;
	

	private PriceType(String code,String message) {
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
