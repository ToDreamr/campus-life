package com.rain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.user.RainyUser;
import com.rain.mapper.user.RainyUserMapper;
import com.rain.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:42
 */
@Service
public class UserServiceImpl extends ServiceImpl<RainyUserMapper, RainyUser> implements UserService {
}
