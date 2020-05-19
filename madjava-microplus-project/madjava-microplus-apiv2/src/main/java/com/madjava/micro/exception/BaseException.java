package com.madjava.micro.exception;

import com.madjava.micro.enumtype.MessageEnum;

public class BaseException extends RuntimeException {
	private int status = 200;
	private MessageEnum messageEnum;
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public BaseException() {
	}

	public BaseException(String message, int status) {
		super(message);
		this.status = status;
	}
	
	public BaseException(MessageEnum messageEnum) {
		super(messageEnum.getMessage());
		this.status = messageEnum.getCode();
		this.messageEnum=messageEnum;
	}
	
	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

	public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MessageEnum getMessageEnum() {
		return messageEnum;
	}

}
