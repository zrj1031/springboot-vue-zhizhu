package com.zrj.vuezhizhu.utils.exceptionHandler;

import com.zrj.vuezhizhu.utils.resultHandler.ResultEnum;

public class ExceptionEntity extends RuntimeException {

    private Integer code;

    public ExceptionEntity(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
    public ExceptionEntity(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
