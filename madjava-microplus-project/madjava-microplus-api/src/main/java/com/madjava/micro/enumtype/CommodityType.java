package com.madjava.micro.enumtype;

public enum CommodityType implements AbstractEnum {
	
	HAITAO("Haitao"),
	GT("GT");
	
	private String name;
	
	CommodityType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
