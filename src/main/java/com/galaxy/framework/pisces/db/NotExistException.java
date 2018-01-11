package com.galaxy.framework.pisces.db;


import com.galaxy.framework.pisces.exception.ExceptionConstant;

public class NotExistException extends DbException {

    public NotExistException() {
        super();
        this.code = ExceptionConstant.DbException.Code.NOTEXIST;
        this.message = ExceptionConstant.DbException.Message.NOTEXIST;
    }

    public NotExistException(String message) {
        super(message);
        this.code = ExceptionConstant.DbException.Code.NOTEXIST;
        this.message = message;
    }

    public NotExistException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
