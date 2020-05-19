package com.madjava.micro.dto;

import java.io.Serializable;
import java.util.List;

import com.madjava.micro.dto.PageData;

import lombok.Data;

@Data
public class PageResponseData<T> implements Serializable{
	
	/**
	 * 通用分页查询返回结果包装
	 */
	private static final long serialVersionUID = -7127435936539400849L;

	private List<T> records;
	
	private PageData<T> pageData;
	
}
