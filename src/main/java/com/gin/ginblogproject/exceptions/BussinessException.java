package com.gin.ginblogproject.exceptions;

import com.gin.ginblogproject.model.code.CodeEnum;

public class BussinessException extends RuntimeException {

    private int code;

    private String message;

    public BussinessException(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public BussinessException(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getText();
    }
}
