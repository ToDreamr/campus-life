package com.rain.controller.common;

import com.rain.entity.common.Result;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/get")
    public Result<String> count(){
        stringRedisTemplate.opsForValue().set("Xiaojun","B", 10,TimeUnit.SECONDS);
        return Result.success("获取redis的值",stringRedisTemplate.opsForValue().get("Xiaojun"));
    }
}
