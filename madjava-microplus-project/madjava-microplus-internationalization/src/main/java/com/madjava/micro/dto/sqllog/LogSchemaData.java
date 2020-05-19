package com.madjava.micro.dto.sqllog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class LogSchemaData implements Serializable {

	private static final long serialVersionUID = 1;

	private String type = "struct";
	
    private List<LogSchemaFieldData> fields;

	private boolean optional = false;
	
	private String name = "sql_log_topic";

    public LogSchemaData()
	{
    	List<LogSchemaFieldData> fields= new ArrayList<>();
    	fields.add(new LogSchemaFieldData("string",false,"traceid"));
    	fields.add(new LogSchemaFieldData("string",false,"siteId"));
    	fields.add(new LogSchemaFieldData("string",false,"applicationName"));
    	fields.add(new LogSchemaFieldData("string",false,"sql"));
    	fields.add(new LogSchemaFieldData("string",false,"startTime","timestamp-millis"));
    	fields.add(new LogSchemaFieldData("double",false,"excutedTime"));
		this.fields=fields;
	}
}
