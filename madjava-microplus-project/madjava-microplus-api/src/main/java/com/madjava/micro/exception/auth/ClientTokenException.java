package com.madjava.micro.exception.auth;

import com.madjava.micro.constant.CommonConstants;
import com.madjava.micro.exception.BaseException;

public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
