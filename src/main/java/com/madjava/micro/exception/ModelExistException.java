package com.madjava.micro.exception;

import com.madjava.micro.enumtype.MessageEnum;

public class ModelExistException extends BaseException {

	private static final long serialVersionUID = -2848976835975430113L;

	public ModelExistException(String message) {
        super(message, MessageEnum.EXISTING_PRODUCTINFO.getCode());
    }
}
