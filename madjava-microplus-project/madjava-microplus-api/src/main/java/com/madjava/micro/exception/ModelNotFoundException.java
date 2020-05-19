package com.madjava.micro.exception;
public class ModelNotFoundException extends BaseException {

	private static final long serialVersionUID = -7640046025092047997L;

	public ModelNotFoundException(String message) {
		super(message);
	}

	public ModelNotFoundException(Throwable cause) {
		super(cause);
	}

	public ModelNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}