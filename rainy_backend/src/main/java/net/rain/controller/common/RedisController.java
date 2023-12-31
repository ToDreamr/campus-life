package net.rain.controller.common;

import io.swagger.annotations.Api;
import net.rain.entity.common.Result;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/redis")
@Api(tags = "Redis",description = "redis测试")
public class RedisController {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/get")
    public Result<String> count(){
        stringRedisTemplate.opsForValue().set("Xiaojun","B", 10,TimeUnit.SECONDS);
        return Result.success("获取redis的值",stringRedisTemplate.opsForValue().get("Xiaojun"));
    }
}
