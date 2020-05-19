package com.madjava.micro.enumtype;

public enum SymbolEnum {
	
	
	EQ("EQ", "="),
	GE("GE", ">="),
	LE("LE", "<=");
	
	private String code;
	
	private String name;

	private SymbolEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static SymbolEnum getSymbolByCode(String code) {
		
		SymbolEnum result = null;
		switch (code) {
		case "EQ":
			result = EQ;
			break;

		case "GE":
			result = GE;
			break;
		case "LE":
			result = LE;
			break;
		default:
			break;
		}
		
		return result;
	}
}
