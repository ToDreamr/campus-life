package com.rain.controller.user.auth;

import com.rain.entity.common.Result;
import com.rain.entity.pojo.user.RainyUser;
import com.rain.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/17 19:13
 */
@RequestMapping("/auth")
@RestController
@Slf4j
public class AuthController {
    @Resource
    UserService  userService;
    @PostMapping("/login")
    //注意必须是Integer，因为int无法进行非null判断！
    //这里封装的对象是实体，需要用@RequestBody
    public Result<RainyUser> login(@RequestBody RainyUser rainyUser) {

        /*
        * 1:前期采用数据库登录验证，比对数据完成之后放行页面
        * 2:添加cookie和Session
        * 3：后期添加校验码等功能*/
        return Result.success(userService.login(rainyUser.getUsername(), rainyUser.getPassword(), rainyUser.getId()));
    }
}
