package com.madjava.micro.dto;

@SuppressWarnings("serial")
public class QueryModelPagableData<T> extends PageData {

	/**
	 * 查询model对应条件
	 */
	private T queryData;

	public T getQueryData() {
		return queryData;
	}

	public void setQueryData(T queryData) {
		this.queryData = queryData;
	}
}
