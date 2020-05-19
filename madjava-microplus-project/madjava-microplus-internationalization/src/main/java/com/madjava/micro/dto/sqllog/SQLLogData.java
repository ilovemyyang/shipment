package com.madjava.micro.dto.sqllog;

import lombok.Data;

@Data
public class SQLLogData {
	private static final long serialVersionUID = 1;

	private LogSchemaData schema;

    private SQLLogPayloadData payload;

    public SQLLogData(SQLLogPayloadData payload)
	{
		this.schema=new LogSchemaData();
		this.payload=payload;
	}
}
