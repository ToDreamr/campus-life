package com.rain.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.rain.entity.pojo.user.RainyUser;

/**
* @author Rainy-Heights
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-04-24 16:18:37
*/
public interface UserService extends IService<RainyUser> {
    RainyUser login(String username,String password,int id);
}
