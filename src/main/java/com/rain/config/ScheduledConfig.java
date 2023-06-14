package com.rain.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/18 15:07
 */
@Configuration
@Slf4j
public class ScheduledConfig {

    @Scheduled(cron = "10 * * * * ?")
    public void showTime(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        log.info("现在是：{}",dateFormat.format(new Date()));
    }
}
