package com.galaxy.framework.pisces.exception.db;


import com.galaxy.framework.pisces.exception.ExceptionConstant;

public class VersionException extends DbException {

    public VersionException() {
        super();
        this.code = ExceptionConstant.DbException.Code.VERSION;
        this.message = ExceptionConstant.DbException.Message.VERSION;
    }

    public VersionException(String message) {
        super(message);
        this.code = ExceptionConstant.DbException.Code.VERSION;
        this.message = message;
    }

    public VersionException(String code, String message) {
        super(String.format("[%s] %s", code, message));
        this.code = code;
        this.message = message;
    }
}
