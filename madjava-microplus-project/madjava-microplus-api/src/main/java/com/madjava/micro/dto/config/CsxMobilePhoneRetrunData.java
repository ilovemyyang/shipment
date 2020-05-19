package com.madjava.micro.dto.config;

import java.io.Serializable;

public class CsxMobilePhoneRetrunData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7944232008972346928L;
	
	private String code;
	
	private String message;
	
	private boolean success;
	
	private String data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
