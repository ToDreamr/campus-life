package com.rain.controller.user.auth;

import com.rain.entity.common.Result;
import com.rain.entity.pojo.user.RainyUser;
import com.rain.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/17 19:13
 */
@RequestMapping("/auth")
@RestController
public class AuthController {
    @Resource
    UserService  userService;
    @PostMapping("/login")
    public Result<RainyUser> login(@RequestParam("id") int id,@RequestParam("username") String username,
                                   @RequestParam("password")String password) {
        /*
        * 1:前期采用数据库登录验证，比对数据完成之后放行页面
        * 2:添加cookie和Session
        * 3：后期添加校验码等功能*/

        return Result.success(userService.login(username, password, id));
    }
}
