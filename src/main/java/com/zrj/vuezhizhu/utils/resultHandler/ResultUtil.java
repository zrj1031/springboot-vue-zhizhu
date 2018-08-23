package com.zrj.vuezhizhu.utils.resultHandler;

public class ResultUtil {
    public static ResultEntity resultConstructor(Integer code, String msg,Object object){
        return new ResultEntity(code,msg,object);
    }
    public static ResultEntity resultSuccess(Object object){
        return ResultUtil.resultConstructor(1,"success",object);
    }
}
