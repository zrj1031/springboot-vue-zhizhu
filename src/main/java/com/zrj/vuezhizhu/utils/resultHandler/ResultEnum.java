package com.zrj.vuezhizhu.utils.resultHandler;

public enum ResultEnum {
    NON_EXISTENT(0,"不存在"),
    SUCCESS(1,"成功");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
