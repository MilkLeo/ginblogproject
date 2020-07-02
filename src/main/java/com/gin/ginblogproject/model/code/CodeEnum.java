package com.gin.ginblogproject.model.code;

public enum CodeEnum {

    SUCCESS(200,"success"),

    FAIL(-1,"请求失败");


    private Integer code;

    private String text;

    CodeEnum(Integer code, String text) {
        this.code = code;
        this.text = text;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
