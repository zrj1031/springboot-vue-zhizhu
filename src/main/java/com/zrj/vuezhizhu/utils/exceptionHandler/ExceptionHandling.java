package com.zrj.vuezhizhu.utils.exceptionHandler;

import com.zrj.vuezhizhu.utils.resultHandler.ResultEntity;
import com.zrj.vuezhizhu.utils.resultHandler.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(value = ExceptionEntity.class)
    @ResponseBody
    public ResultEntity exceptionHandler(ExceptionEntity e){
        return ResultUtil.resultConstructor(e.getCode(),e.getMessage(),null);
    }
}
