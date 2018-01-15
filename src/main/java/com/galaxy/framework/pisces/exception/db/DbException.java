package com.galaxy.framework.pisces.exception.db;


import com.galaxy.framework.pisces.exception.ExceptionConstant;
import com.galaxy.framework.pisces.exception.GlobalException;

public class DbException extends GlobalException {

    public DbException() {
        super();
        this.code = ExceptionConstant.DbException.Code.DB;
        this.message = ExceptionConstant.DbException.Message.DB;
    }

    public DbException(String message) {
        super(message);
        this.code = ExceptionConstant.DbException.Code.DB;
        this.message = message;
    }

    public DbException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
