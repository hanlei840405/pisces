package com.galaxy.framework.pisces.db;


import com.galaxy.framework.pisces.exception.ExceptionConstant;

public class UpdateException extends DbException {

    public UpdateException() {
        super();
        this.code = ExceptionConstant.DbException.Code.UPDATE;
        this.message = ExceptionConstant.DbException.Message.UPDATE;
    }

    public UpdateException(String message) {
        super(message);
        this.code = ExceptionConstant.DbException.Code.UPDATE;
        this.message = message;
    }

    public UpdateException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
