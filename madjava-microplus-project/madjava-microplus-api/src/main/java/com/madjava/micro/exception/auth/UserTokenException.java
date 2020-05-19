package com.madjava.micro.exception.auth;

import com.madjava.micro.constant.CommonConstants;
import com.madjava.micro.exception.BaseException;

public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
