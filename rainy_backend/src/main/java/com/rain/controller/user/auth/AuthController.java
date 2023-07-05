package com.rain.controller.user.auth;

import com.rain.entity.common.CurrentUser;
import com.rain.entity.common.R;
import com.rain.entity.common.Result;
import com.rain.entity.exception.UserLoginException;
import com.rain.entity.pojo.user.RainyUser;
import com.rain.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/17 19:13
 */
@RequestMapping("/auth")
@RestController
@Slf4j
@Api(tags = "AuthController",description = "登录注册")
public class AuthController {
    @Resource
    UserService  userService;
    @PostMapping("/login")
    //注意必须是Integer，因为int无法进行非null判断！
    //这里封装的对象是实体，需要用@RequestBody
    public Result<RainyUser> login(@RequestBody RainyUser rainyUser,HttpServletResponse response) {

        /*
        * 1:前期采用数据库登录验证，比对数据完成之后放行页面
        * 2:添加cookie和Session
        * 3：后期添加校验码等功能*/
        try {
            RainyUser user = userService.login(rainyUser.getUsername(), rainyUser.getPassword(), rainyUser.getId());
            if (user!=null){
                setCookie(response,user.getUsername(),String.valueOf(user.getId()),true);
                CurrentUser.setCurrentId(user.getId());//设置当前用户
                return Result.success("登录成功",user);
            }
        }catch (UserLoginException e){
            return Result.errorMsg(e.getMessage());//返回上一层Service抛出的错误信息
        }
        throw new RuntimeException("登录失败");
    }

    /**
     * 查询用户cookie
     * @param request re
     * @return R
     */
    @GetMapping("/cookie")
    public R getCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            R r = new R();
            for (Cookie cookie : cookies) {
                //3.获取cookie的名称
                String name = cookie.getName();
                //4.判断名称是否存在
                if ("name".equals(name)) {
                    //有该Cookie，不是第一次访问
                    r.setCookie(cookie.getValue());
                }
                if ("id".equals(name)) {
                    //有该Cookie，不是第一次访问
                    r.setId(Integer.valueOf(cookie.getValue()));
                }
            }
            return r;
        }
        return null;
    }

    /**
     * setCookie
     *
     * @param response 响应
     * @param name     名字
     * @param id       id
     * @param flag     删除或加入cookie
     */
    public void setCookie(HttpServletResponse response, String name, String id,Boolean flag) {
        // 创建一个 cookie对象
        Cookie cookie = new Cookie("name", name);
        Cookie cookie2 = new Cookie("id",id);
        if (flag){
            cookie.setMaxAge(7 * 24 * 60 * 60);
            cookie2.setMaxAge(7 * 24 * 60 * 60);
        }else {
            cookie.setMaxAge(0);
            cookie2.setMaxAge(0);
        }

        //将cookie对象加入response响应
        response.addCookie(cookie);
        response.addCookie(cookie2);
    }

    /**
     *
     * @param response 浏览器响应体
     * @return 返回登出成功信息并且清除Cookie和Session浏览器信息
     */
    @PostMapping("/logout")
    public Result<String> logout(HttpServletResponse response){
        //清除session，cookie等信息
        setCookie(response,userService.getUser(CurrentUser.getCurrentId()).getUsername(),
                String.valueOf(userService.getUser(CurrentUser.getCurrentId()).getId()),false);
        //没有解决未登录时没有录入状态信息的bug：
        //Cannot invoke "java.lang.Long.longValue()" because the return value of "java.lang.ThreadLocal.get()" is null
        return Result.success("退出成功");
    }

}
