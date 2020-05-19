package com.madjava.micro.facade.pagable;

import java.util.Map;

import com.madjava.micro.dto.response.TableResultResponse;

public interface PagebaleFacade<T> {
	TableResultResponse<T> selectPageByQueryParam(Map<String, Object> params, Map<String, String> fieldsMapping);
}
