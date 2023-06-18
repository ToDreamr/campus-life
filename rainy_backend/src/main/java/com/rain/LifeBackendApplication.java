package com.rain;

import com.rain.entity.common.CurrentUser;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.UUID;

@Slf4j
@SpringBootApplication
@MapperScan("com.rain.mapper")
@EnableScheduling
@EnableAsync
@EnableSwagger2
public class LifeBackendApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(LifeBackendApplication.class, args);
        CurrentUser.setCurrentId(Math.abs(UUID.randomUUID().getLeastSignificantBits()%20000));
        //随机根据当前时间戳生成线程ID
        log.info("本地随机生成线程ID:{}",CurrentUser.getCurrentId());
        log.info("http://localhost:"+context.getEnvironment().getProperty("server.port")+"/index.html");
    }
}
