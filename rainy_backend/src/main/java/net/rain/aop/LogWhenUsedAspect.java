package net.rain.aop;

import net.rain.annotations.LogWhenUsed;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.aop.AspectException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/25 13:01
 */
@Aspect
@Component
@Slf4j
public class LogWhenUsedAspect {

    /**
     * 织入,切入点
     */
    @Pointcut("@annotation(net.rain.annotations.LogWhenUsed)")
    public void logInfo(){

    }

    /**
     * 环绕方法
     */

    //关于Spring切面内容：
    /*
    * 1：Signature对象：作为接口，用于跟踪关于连接点的反射信息。
    * Signature 也是为了获取原始方法的各种信息而存在的，并且信息更加的简洁，
    * 方便我们截取，他与JoinPoint合作可以让我们更方便的获取原始方法的各种信息
    *
    * 2：MethodSignature对象：解决了不能获得方法本省Method类的问题
    * */
    @AfterReturning("logInfo()")
     public void LogWhenUsed(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        LogWhenUsed logWhenUsed=method.getAnnotation(LogWhenUsed.class);
        try{
            String name = logWhenUsed.name();
            String date = logWhenUsed.date();
            String value = logWhenUsed.value();
            log.info("Hello,{}!Welcome,today is {},{}",name,date,value);
        }catch (AspectException e){
            e.printStackTrace();
        }
    }
}
