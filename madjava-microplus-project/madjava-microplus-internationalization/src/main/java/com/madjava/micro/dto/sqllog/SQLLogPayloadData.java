package com.madjava.micro.dto.sqllog;

import java.io.Serializable;

import lombok.Data;

@Data
public class SQLLogPayloadData implements Serializable {

	private static final long serialVersionUID = 1;

    private String traceid;
    private String siteId;
    private String applicationName;
    private String sql;
    private String startTime;
    private long excutedTime;

}
