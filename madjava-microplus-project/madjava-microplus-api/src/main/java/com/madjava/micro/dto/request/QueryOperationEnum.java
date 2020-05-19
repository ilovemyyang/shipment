package com.madjava.micro.dto.request;

public enum QueryOperationEnum {
	ANDNOTEQUAL("AndNotEqual"), 
	ANDLIKE("AndLike"), 
	ANDBETWEEN("AndBetween"),
	ANDISNULL("AndIsNull"),
	ORLIKE("OrLike"),
	OREQUALTO("orEqualTo"),
	ANDISNOTNULL( "AndIsNotFull");

	private final String operation;

	private QueryOperationEnum(String operation) {
		this.operation = operation;
	}
	
	public String toString() {
		return this.operation;
	}
}
