package com.galaxy.framework.pisces.exception.rule;


import com.galaxy.framework.pisces.exception.ExceptionConstant;
import com.galaxy.framework.pisces.exception.GlobalException;

public class RuleException extends GlobalException {

    public RuleException() {
        super();
        this.code = ExceptionConstant.RuleException.Code.RULE;
        this.message = ExceptionConstant.RuleException.Message.RULE;
    }

    public RuleException(String message) {
        super(message);
        this.code = ExceptionConstant.RuleException.Code.RULE;
        this.message = message;
    }

    public RuleException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
