package net.rain;

import lombok.extern.slf4j.Slf4j;
import net.rain.entity.common.CurrentUser;
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
@MapperScan("net.rain.mapper")
@EnableScheduling
@EnableAsync
@EnableSwagger2
public class BackendApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(BackendApplication.class, args);
        CurrentUser.setCurrentId(10086);
//        CurrentUser.setCurrentId(Math.abs(UUID.randomUUID().getLeastSignificantBits()%20000));
        //随机根据当前时间戳生成线程ID
//        log.info("本地随机生成线程ID:{}",CurrentUser.getCurrentId());
        log.info("进入项目在：http://localhost:"+context.getEnvironment().getProperty("server.port")+"/page/login/login.html");
        log.info("项目api文档在：http://localhost:"+context.getEnvironment().getProperty("server.port")+"/swagger-ui.html#/");
    }
}
