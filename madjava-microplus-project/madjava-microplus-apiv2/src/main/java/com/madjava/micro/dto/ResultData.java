package com.madjava.micro.dto;

import java.io.Serializable;

import com.madjava.micro.enumtype.MessageEnum;

@SuppressWarnings("serial")
public class ResultData<T> implements Serializable {

	private boolean isSuccessful;
	
	private int code;
	
	private T serializableData;
	
	private MessageEnum messageEnum;
	
	private String message;

	public ResultData() {
		
	}
	
	public ResultData(T serializableData, MessageEnum messageEnum) {
		super();
		this.serializableData = serializableData;
		
		if (messageEnum == MessageEnum.SUCCESS) {
			isSuccessful = true;
		}
		
		this.code = messageEnum.getCode();
		this.messageEnum = messageEnum;
		this.message=messageEnum.getMessage();
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setSerializableData(T serializableData) {
		this.serializableData = serializableData;
	}

	public MessageEnum getMessageEnum() {
		return messageEnum;
	}

	public void setMessageEnum(MessageEnum messageEnum) {
		this.messageEnum = messageEnum;
	}

	public T getSerializableData() {
		return serializableData;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
    public static  ResultData  paramError(String errorMsg) {
    	ResultData result = new ResultData();
        result.setCode(MessageEnum.PARAMS_INCORRECT.getCode());
        result.setMessage(errorMsg);
        return result;
    }
}
