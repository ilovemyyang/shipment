package com.madjava.micro.dto.baseservice;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class BaseItemData implements ItemData {

	private static final long serialVersionUID = 224524092091681555L;
	
	@Setter
	@Getter
	private List<String> errors;
}
