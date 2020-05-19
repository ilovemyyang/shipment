package com.madjava.micro.dto.response;

import com.madjava.micro.enumtype.MessageEnum;

public class ObjectRestResponse<T> extends BaseResponse {

    T data;
    private MessageEnum messageEnum;

    public ObjectRestResponse data(T data) {
        this.setData(data);
        return this;
    }
    
    
    public ObjectRestResponse() {
	}

	public ObjectRestResponse(T data, MessageEnum messageEnum) {
		super(messageEnum.getCode(), messageEnum.getMessage());
		
		this.data = data;
		this.messageEnum = messageEnum;
	}

	public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

	public MessageEnum getMessageEnum() {
		return messageEnum;
	}

	public void setMessageEnum(MessageEnum messageEnum) {
		this.messageEnum = messageEnum;
	}


}
