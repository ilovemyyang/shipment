package com.madjava.micro.facade.pagable;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.madjava.micro.dto.request.QueryOperationParam;
import com.madjava.micro.dto.request.QueryParam;
import com.madjava.micro.dto.response.TableResultResponse;
import com.madjava.micro.dto.util.AbstractConverter;
import com.madjava.micro.dto.util.QueryParamUtil;

public abstract class AbstractPageableFacade<S,T> implements PagebaleFacade<T> {

	@Override
	public TableResultResponse<T> selectPageByQueryParam(final Map<String,Object> params,final Map<String,String> fieldsMapping) {
		final List<String> fieldsExcludeEqual = createExcludeEqualFields();
		final QueryParam queryParam = QueryParamUtil.createQueryParam(params, fieldsExcludeEqual);
		
		final List<QueryOperationParam> queryOperationParams = new LinkedList<>();
		queryParam.setOperations(queryOperationParams);
		
		final QueryOperationParam createTimeBetween = QueryParamUtil.createTimeBetweenOperation(params, "createTimeStart", "createTimeEnd", fieldsMapping.get("createTimeFieldName"),fieldsMapping.get("createTimeFieldformat"));
		if(createTimeBetween != null ) {
			queryOperationParams.add(createTimeBetween);
		}
		
		final QueryOperationParam updateTimeBetween = QueryParamUtil.createTimeBetweenOperation(params, "updateTimeStart", "updateTimeEnd", fieldsMapping.get("updateTimeFieldName"), fieldsMapping.get("updateTimeFieldformat"));
		if(updateTimeBetween != null ) {
			queryOperationParams.add(updateTimeBetween);
		}
		
		final List<String> andLikeFields = createAndLikeFields();
		if(CollectionUtils.isEmpty(andLikeFields)) {
			for(String field: andLikeFields) {
				final QueryOperationParam nameAndLike = QueryParamUtil.createLikeOperationParam(field, (String)params.get(field));
				if(nameAndLike != null ) {
					queryOperationParams.add(nameAndLike);
				}
			}
		}
		
		final TableResultResponse<S> tableResultResponse = selectPageByQueryParam(queryParam);
		return getAbstractConverter().convertResponse(tableResultResponse);
	}

	public abstract List<String> createExcludeEqualFields();
	public abstract List<String> createAndLikeFields();
	public abstract TableResultResponse<S> selectPageByQueryParam(final QueryParam queryParam);
	public abstract AbstractConverter<S,T> getAbstractConverter();

}
