package net.rain.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.rain.entity.exception.UserLoginException;
import net.rain.entity.pojo.user.RainyUser;
import net.rain.mapper.user.RainyUserMapper;
import net.rain.service.common.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:42
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<RainyUserMapper, RainyUser> implements UserService {
    @Resource
    RainyUserMapper userMapper;
    @Override
    public RainyUser login(String username, String password,int id) {
        LambdaQueryWrapper<RainyUser> lambdaQueryWrapper = new LambdaQueryWrapper<RainyUser>();
        lambdaQueryWrapper.eq(RainyUser::getPassword,password).eq(RainyUser::getUsername,username);
        //等值查询，条件是用户名和密码
        List<RainyUser> users = userMapper.selectList(lambdaQueryWrapper);//存储类型为线性表List
        //用户不为空，返回查询到的用户。

        //判空用这个来解决
        if (!users.isEmpty()){
            for (RainyUser user:users) {
                System.out.println(user);
                // RainyUser(id=2, username=user, password=username, nickName=username, userRole=0)
            }
            return users.get(0);
        }
        //抛出登录异常信息
        throw new UserLoginException("输入信息有误或不存在该用户");
    }

    @Override
    public RainyUser getUser(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public RainyUser sign(RainyUser rainyUser) {
        LambdaQueryWrapper<RainyUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RainyUser::getId,rainyUser.getId());
        List<RainyUser> historyUser = userMapper.selectList(queryWrapper);

        if (!historyUser.isEmpty()){
            throw new UserLoginException("该用户已存在，无需继续注册");
        }else {
            userMapper.insert(rainyUser);
            System.out.println(rainyUser);
        }
        return userMapper.selectById(rainyUser.getId());
    }
}
