package net.rain.entity.exception;

import lombok.Data;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/2 15:26
 */
@Data
/**
 * 自定义异常
 */
public class BaseException extends RuntimeException {

    public BaseException(String msg){
        throw new RuntimeException(msg);
    }
}
