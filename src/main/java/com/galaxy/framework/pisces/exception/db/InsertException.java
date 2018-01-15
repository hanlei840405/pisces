package com.galaxy.framework.pisces.exception.db;


import com.galaxy.framework.pisces.exception.ExceptionConstant;

public class InsertException extends DbException {

    public InsertException() {
        super();
        this.code = ExceptionConstant.DbException.Code.INSERT;
        this.message = ExceptionConstant.DbException.Message.INSERT;
    }

    public InsertException(String message) {
        super(message);
        this.code = ExceptionConstant.DbException.Code.INSERT;
        this.message = message;
    }

    public InsertException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
