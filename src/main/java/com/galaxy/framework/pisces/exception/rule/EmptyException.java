package com.galaxy.framework.pisces.exception.rule;


import com.galaxy.framework.pisces.exception.ExceptionConstant;
import com.galaxy.framework.pisces.exception.GlobalException;

public class EmptyException extends GlobalException {

    public EmptyException() {
        super();
        this.code = ExceptionConstant.RuleException.Code.EMPTY;
        this.message = ExceptionConstant.RuleException.Message.EMPTY;
    }

    public EmptyException(String message) {
        super(message);
        this.code = ExceptionConstant.RuleException.Code.EMPTY;
        this.message = message;
    }

    public EmptyException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
