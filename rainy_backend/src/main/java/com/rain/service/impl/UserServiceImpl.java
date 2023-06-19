package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.exception.BaseException;
import com.rain.entity.pojo.user.RainyUser;
import com.rain.mapper.user.RainyUserMapper;
import com.rain.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:42
 */
@Service
public class UserServiceImpl extends ServiceImpl<RainyUserMapper, RainyUser> implements UserService {
    @Resource
    RainyUserMapper userMapper;
    @Override
    public RainyUser login(String username, String password,int id) {
        LambdaQueryWrapper<RainyUser> lambdaQueryWrapper = new LambdaQueryWrapper<RainyUser>();
        lambdaQueryWrapper.eq(RainyUser::getPassword,password).eq(RainyUser::getUsername,username);
        //等值查询，条件是用户名和密码
        List<RainyUser> users = userMapper.selectList(lambdaQueryWrapper);
        if (users!=null){
            return users.get(0);
        }
        throw new BaseException("输入参数有误或不存在该用户");
    }
}
