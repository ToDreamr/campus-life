package com.rain.entity.exception;

import com.rain.entity.common.Result;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/18 14:03
 */
@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> validateHandler(MethodArgumentNotValidException exception){
        ObjectError error = exception.getBindingResult().getAllErrors().get(0);
        return Result.errorMsg(error.getDefaultMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    public Result<String> validateHandler(NullPointerException exception){
        log.error(exception.getMessage());
        return Result.error("参数不合法，返回数据为空",null);
    }

    //最底层的抛出，返回给前端这条信息将会
    @ExceptionHandler(RuntimeException.class)
    public Result<String> validateHandler(RuntimeException exception){
        log.error(exception.getMessage());
        return Result.error(exception.getMessage(), null);
    }
}
