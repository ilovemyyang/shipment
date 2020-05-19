package com.madjava.micro.enumtype;

public enum StockLevelStatus implements AbstractEnum {
	
	INSTOCK("INSTOCK"),
	LOWSTOCK("LOWSTOCK"),
	OUTOFSTOCK("OUTOFSTOCK");

	private String name;
	
	StockLevelStatus(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

}
