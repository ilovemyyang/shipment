package com.madjava.micro.enumtype;

public enum CustomerCouponStausEnum {
	NOUSE((byte) 0, "未使用"), USED((byte) 1, "已使用");
	private byte code;
	
	private String message;

	private CustomerCouponStausEnum(byte code, String message) {
		this.code = code;
		this.message = message;
	}

	public byte getCode() {
		return code;
	}

	public void setCode(byte code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}	

