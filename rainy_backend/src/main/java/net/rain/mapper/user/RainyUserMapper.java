package net.rain.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.rain.entity.pojo.user.RainyUser;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Rainy-Heights
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2023-04-24 13:36:34
* @Entity com.rain.entity.pojo.user.RainyUser
*/
@Mapper
public interface RainyUserMapper extends BaseMapper<RainyUser> {

}




