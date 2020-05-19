package com.madjava.micro.enumtype;

/**
 *  商品类型枚举类
 * @author Administrator
 *
 */
public enum ProductTypeEnum {

	 FreeTrade((byte)1,"永辉全球购自营"),
	 DirectMall((byte)2,"海外直邮"), 
	 FenXiao((byte)3,"永辉全球购自营"),
	 GT((byte)4,"永辉自营");
	
	private byte code;
	
	private String name;

	private ProductTypeEnum(byte code, String name) {
		this.code = code;
		this.name = name;
	}

	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
