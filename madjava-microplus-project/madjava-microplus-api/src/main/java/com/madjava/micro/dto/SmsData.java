package com.madjava.micro.dto;

import java.io.Serializable;

import com.madjava.micro.enumtype.SmsResultEnum;

public class SmsData implements Serializable {

	public SmsData(SmsResultEnum status, String detail) {
		super();
		this.status = status;
		this.detail = detail;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SmsResultEnum status;
	
	private String detail;

	public SmsResultEnum getStatus() {
		return status;
	}

	public void setStatus(SmsResultEnum status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
