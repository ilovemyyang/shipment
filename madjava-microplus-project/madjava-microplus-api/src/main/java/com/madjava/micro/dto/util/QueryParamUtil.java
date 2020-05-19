package com.madjava.micro.dto.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.madjava.micro.dto.request.QueryOperationEnum;
import com.madjava.micro.dto.request.QueryOperationParam;
import com.madjava.micro.dto.request.QueryParam;

public class QueryParamUtil{
	//TODO builder
	public static QueryParam createQueryParam(final Map<String,Object> params, final List<String> fieldsExcludeEqual) {
		final QueryParam queryParam = new QueryParam();
		final Object sortParams= params.get("sortParams");
		if(sortParams != null) {
			queryParam.setSortParams((Map)sortParams);
		}
		params.remove("sortParams", sortParams);
		
		final Map<String,Object> paramsTemp = new HashMap<>();
		queryParam.setQueryParams(paramsTemp);
		params.entrySet().stream().filter(item -> !fieldsExcludeEqual.contains(item.getKey())) 
			.forEach(item->addParam(paramsTemp,item.getKey(),item.getValue(),(item.getKey() != null &&item.getValue()!= null )));
		return queryParam;
	}
	
	public static void addParam(final Map<String, Object> params, final String key,final Object value, final boolean putFlag) {
		if (putFlag) {
			params.put(key, value);
		}
	}
	
	public static QueryOperationParam createLikeOperationParam( final String field,final String value) {
		if(!StringUtils.isEmpty(field) &&!StringUtils.isEmpty(value) ) {
			return createQueryOperationParam(QueryOperationEnum.ANDLIKE,field,"%"+value+"%",null);
		}else {
			return null;
		}
	}
	
	public static QueryOperationParam createTimeBetweenOperation(final Map<String,Object> params, final String startKey,final String endKey,final String field, final String format) {
		final String createTimeStart = (String) params.get(startKey); 
		final String createTimeEnd = (String)params.get(endKey);
		if(!StringUtils.isEmpty(createTimeStart) &&! StringUtils.isEmpty(createTimeEnd)) {
			if(!StringUtils.isEmpty(format)) {
				//TODO api validate
			}
			return createQueryOperationParam(QueryOperationEnum.ANDBETWEEN,field,createTimeStart,createTimeEnd);
		}else {
			return null;
		}
	}
	
	public static QueryOperationParam createQueryOperationParam(final QueryOperationEnum operation, final String key,final Object value,final Object value2) {
		final QueryOperationParam param = new QueryOperationParam();
		param.setOperation(operation);
		param.setKey(key);
		param.setValue(value);
		param.setValue2(value2);
		return param;
	}
}
