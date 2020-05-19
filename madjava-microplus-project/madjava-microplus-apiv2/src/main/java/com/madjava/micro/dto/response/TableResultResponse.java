package com.madjava.micro.dto.response;

import java.util.List;

import com.madjava.micro.enumtype.MessageEnum;

public class TableResultResponse<T> extends BaseResponse {

    TableData<T> data;
    private MessageEnum messageEnum;

    public TableResultResponse(long total, List<T> rows) {
        this.data = new TableData<T>(total, rows);
    }
    
    public TableResultResponse(long total, List<T> rows, MessageEnum messageEnum) {
    	super(messageEnum.getCode(), messageEnum.getMessage());
        this.data = new TableData<T>(total, rows);
    }

    public TableResultResponse() {
        this.data = new TableData<T>();
    }

    TableResultResponse<T> total(int total) {
        this.data.setTotal(total);
        return this;
    }

    TableResultResponse<T> total(List<T> rows) {
        this.data.setRows(rows);
        return this;
    }

    public TableData<T> getData() {
        return data;
    }

    public void setData(TableData<T> data) {
        this.data = data;
    }

    public MessageEnum getMessageEnum() {
		return messageEnum;
	}

	public void setMessageEnum(MessageEnum messageEnum) {
		super.setCode(messageEnum.getCode());
		super.setMessage(messageEnum.getMessage());
		this.messageEnum = messageEnum;
	}

}
