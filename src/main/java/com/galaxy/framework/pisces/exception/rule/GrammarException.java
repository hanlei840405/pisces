package com.galaxy.framework.pisces.exception.rule;

import com.galaxy.framework.pisces.exception.ExceptionConstant;
import com.galaxy.framework.pisces.exception.GlobalException;

/**
 * Created by hanlei6 on 2018/1/15.
 */
public class GrammarException extends GlobalException {

    public GrammarException() {
        super();
        this.code = ExceptionConstant.RuleException.Code.GRAMMAR;
        this.message = ExceptionConstant.RuleException.Message.GRAMMAR;
    }

    public GrammarException(String message) {
        super(message);
        this.code = ExceptionConstant.RuleException.Code.GRAMMAR;
        this.message = message;
    }

    public GrammarException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
