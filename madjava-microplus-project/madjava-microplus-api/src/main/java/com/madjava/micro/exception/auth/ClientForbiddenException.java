package com.madjava.micro.exception.auth;

import com.madjava.micro.constant.CommonConstants;
import com.madjava.micro.exception.BaseException;

public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
