package com.madjava.micro.dto.sqllog;

import java.io.Serializable;

import lombok.Data;

@Data
public class LogSchemaFieldData implements Serializable {

	private static final long serialVersionUID = 1;

	private String type;
	private boolean optional;
    private String field;
    private String logicalType;

    public LogSchemaFieldData(String type,boolean optional,String field)
	{
		this.type=type;
		this.optional=optional;
		this.field=field;
	}
    
    public LogSchemaFieldData(String type,boolean optional,String field,String logicalType)
	{
		this.type=type;
		this.optional=optional;
		this.field=field;
		this.logicalType=logicalType;
	}
}
