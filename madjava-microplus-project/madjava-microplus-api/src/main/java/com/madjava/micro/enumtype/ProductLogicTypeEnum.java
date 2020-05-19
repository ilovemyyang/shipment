package com.madjava.micro.enumtype;

public enum ProductLogicTypeEnum {
	
	EXCLUDE("Exclude", "排除的商品"), 
	QUALIFYINGS("Qualifying", "生效的商品");
	private String code;
	
	private String message;

	private ProductLogicTypeEnum(String code, String message) {
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
