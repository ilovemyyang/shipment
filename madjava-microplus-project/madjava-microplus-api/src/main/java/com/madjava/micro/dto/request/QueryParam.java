package com.madjava.micro.dto.request;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class QueryParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8988101366371385621L;

	private Map<String, Object> queryParams;
	
	private Map<String, Object> sortParams;
	
	private List<QueryOperationParam> operations;

	public Map<String, Object> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(Map<String, Object> queryParams) {
		this.queryParams = queryParams;
	}

	public Map<String, Object> getSortParams() {
		return sortParams;
	}

	public void setSortParams(Map<String, Object> sortParams) {
		this.sortParams = sortParams;
	}

	public List<QueryOperationParam> getOperations() {
		return operations;
	}

	public void setOperations(List<QueryOperationParam> operations) {
		this.operations = operations;
	}

}
