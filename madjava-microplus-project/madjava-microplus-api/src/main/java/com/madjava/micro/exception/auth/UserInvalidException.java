package com.madjava.micro.exception.auth;

import com.madjava.micro.constant.CommonConstants;
import com.madjava.micro.exception.BaseException;

public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
