package com.madjava.micro.dto.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.madjava.micro.dto.response.TableData;
import com.madjava.micro.dto.response.TableResultResponse;

public abstract class AbstractConverter<Source,Target> {
	public abstract Target convertToData(final Source entity );
	public abstract Source convert(final Target data );
	
	public List<Target> converterAll(final List<Source> sourceList, final List<Target> targetList){
		if(sourceList == null) {
			return Collections.emptyList();
		}
		
		List<Target>  result = ( targetList == null ) ? new ArrayList<Target>(sourceList.size()) : targetList ;
		
		for(Source item:sourceList) {
			result.add(convertToData(item));
		}
		return result;
	}
	
	public List<Source> converterAllToModel(final List<Target> dataList, List<Source> modelList){
		if(dataList == null) {
			return Collections.emptyList();
		}
		
		List<Source>  result = ( modelList == null ) ? new ArrayList<Source>(dataList.size()) : modelList ;
		
		for(Target item:dataList) {
			result.add(convert(item));
		}
		return result;
	}
	
	public TableResultResponse<Target> convertResponse(final TableResultResponse<Source> source){
		final TableResultResponse<Target> result = new TableResultResponse<>();
		result.setCode(source.getCode());
		result.setMessage(source.getMessage());
		if(source.getMessageEnum()!=null) {
			result.setMessageEnum(source.getMessageEnum());
		}
		
		final TableData<Target> tableData = new TableData<>();
		result.setData(tableData);
		
		final TableData<Source> sourceTableData  = source.getData();
		tableData.setTotal(sourceTableData != null ? sourceTableData.getTotal() : 0);
		tableData.setRows(converterAll(sourceTableData.getRows(),null));
		return result;
	}
}
