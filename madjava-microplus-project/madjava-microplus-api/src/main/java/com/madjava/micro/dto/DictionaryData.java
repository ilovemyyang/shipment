package com.madjava.micro.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DictionaryData implements Serializable {

	private String key;
	
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
