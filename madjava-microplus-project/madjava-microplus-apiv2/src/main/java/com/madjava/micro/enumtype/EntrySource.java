package com.madjava.micro.enumtype;


/**
 *
 */
public enum EntrySource
{
	Bundle_Slave("Bundle_Slave","组合产品(附属)"), 
	Bundle_Master("Bundle_Master","组合产品(主)"), 
	Promotion("Promotion","促销产品"), 
	Normal("Normal","普通产品");
	
	private String code;
	
	private String message;
	

	private EntrySource(String code,String message) {
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
