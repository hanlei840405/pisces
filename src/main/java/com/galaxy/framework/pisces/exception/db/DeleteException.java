package com.galaxy.framework.pisces.exception.db;


import com.galaxy.framework.pisces.exception.ExceptionConstant;

public class DeleteException extends DbException {

    public DeleteException() {
        super();
        this.code = ExceptionConstant.DbException.Code.DELETE;
        this.message = ExceptionConstant.DbException.Message.DELETE;
    }

    public DeleteException(String message) {
        super(message);
        this.code = ExceptionConstant.DbException.Code.DELETE;
        this.message = message;
    }

    public DeleteException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
