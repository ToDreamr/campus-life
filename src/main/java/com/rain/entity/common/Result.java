package com.rain.entity.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/26 0:36
 */
@Data
@NoArgsConstructor
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * //返回信息参数
     * @param message
     * @param data
     * @param <T>
     * @return
     */
     public static <T> Result<T> success(String message,T data){
         return new Result<>(200,message,data);
     }
    /**
     * 返回错误信息
     * @param message
     * @param <T>
     * @return
     */
     public static <T> Result<T> errorMsg(String message){
        return new Result<>(400,message,null);
     }

    public static <T> Result<T> error(String message,T data){
        return new Result<>(500,message,data);
    }

    /**
     * 只返回数据信息
     * @param data
     * @param <T>
     * @return
     */
     public static <T> Result<T> success(T data){
        Result result=new Result();
        result.data=data;
        result.code=200;
        return result;
     }

    public static <T> Result<T> message(T data, int code, String message){
        Result result=new Result();
        result.data=data;
        result.code=code;
        result.message=message;
        return result;
    }
     /*
     * 还可以设置一个判断正常数据或者错位的函数，只需要检查SUCCESS和FALIURED这两个标签即可*/
}
