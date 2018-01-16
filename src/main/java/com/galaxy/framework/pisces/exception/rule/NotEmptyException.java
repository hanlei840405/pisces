package com.galaxy.framework.pisces.exception.rule;


import com.galaxy.framework.pisces.exception.ExceptionConstant;
import com.galaxy.framework.pisces.exception.GlobalException;

public class NotEmptyException extends GlobalException {

    public NotEmptyException() {
        super();
        this.code = ExceptionConstant.RuleException.Code.NOT_EMPTY;
        this.message = ExceptionConstant.RuleException.Message.NOT_EMPTY;
    }

    public NotEmptyException(String message) {
        super(message);
        this.code = ExceptionConstant.RuleException.Code.NOT_EMPTY;
        this.message = message;
    }

    public NotEmptyException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
