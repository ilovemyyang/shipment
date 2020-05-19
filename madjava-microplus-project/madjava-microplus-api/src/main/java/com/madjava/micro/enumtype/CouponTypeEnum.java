package com.madjava.micro.enumtype;

public enum CouponTypeEnum {
	SINGLE("single", "单张券"), SYSTEM("system", "用户领券或系统发券");
	private String code;
	
	private String message;

	private CouponTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

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
}	

