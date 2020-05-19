package com.madjava.micro.dto;

import lombok.Data;

@Data
public class GrafanaData {

	private String message;
	
	private String ruleName;
	
	private String ruleUrl;
	
	private String state;
	
	private String title;
	
	private String ruleId;
}
