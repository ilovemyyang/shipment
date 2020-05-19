package com.madjava.micro.enumtype;

/**
 *  商品类型枚举类
 * @author Administrator
 *
 */
public enum ProductStatusEnum {

	APPROVED("approved", "通过"), 
	CHECK("check", "检查"), 
	UNAPPROVED("unapproved", "未通过");

	private String code;

	private String name;

	private ProductStatusEnum(String code, String name) {
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
