package com.madjava.micro.dto.request;

import java.io.Serializable;

public class QueryOperationParam  implements Serializable{
	private static final long serialVersionUID = 2257952840892398088L;

	private String key;	  
	private Object value; //start value for between query
	private Object value2;//end value for between query
	private QueryOperationEnum operation;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public QueryOperationEnum getOperation() {
		return operation;
	}
	public void setOperation(QueryOperationEnum operation) {
		this.operation = operation;
	}
	public Object getValue2() {
		return value2;
	}
	public void setValue2(Object value2) {
		this.value2 = value2;
	}
	
}
