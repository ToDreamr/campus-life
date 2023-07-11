package net.rain.entity.exception;

import lombok.Data;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/25 18:32
 */
@Data
public class UserLoginException  extends RuntimeException{
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public UserLoginException(String msg) {
        throw new RuntimeException(msg);
    }
}
