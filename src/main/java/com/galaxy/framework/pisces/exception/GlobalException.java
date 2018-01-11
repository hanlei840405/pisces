package com.galaxy.framework.pisces.exception;

/**
 * Created by hanlei6 on 2017/12/11.
 */
public class GlobalException extends RuntimeException {
    public String code;

    public String message;

    public GlobalException() {
        super();
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String code, String message) {
        super(String.format("[%s] %s", code, message));
    }
}
