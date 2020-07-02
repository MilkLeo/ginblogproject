package com.gin.ginblogproject.model.responses;

import com.gin.ginblogproject.model.code.CodeEnum;
import lombok.Data;

@Data
public class ResponseData<T> {


    private Integer code;

    private T data;

    private String message;


    public ResponseData(Integer code, T data) {
        this.code = code;
        this.data = data;
    }
}
