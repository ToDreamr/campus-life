package net.rain.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/25 12:58
 */
@Retention(RetentionPolicy.RUNTIME)//运行时开启
@Target(ElementType.METHOD)//作用域为方法上
public @interface LogWhenUsed {
    String value() default " ";

    String name() default "Rainy-Heights";

    String date() default "2023-01-01";
}
