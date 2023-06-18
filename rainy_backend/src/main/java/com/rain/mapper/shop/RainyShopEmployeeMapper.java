package com.rain.mapper.shop;

import com.rain.entity.pojo.shop.RainyShopEmployee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_employee(员工表)】的数据库操作Mapper
* @createDate 2023-04-24 16:23:44
* @Entity com.rain.service.RainyShopEmployee
*/
@Repository
public interface RainyShopEmployeeMapper extends BaseMapper<RainyShopEmployee> {
    @Select("select * from school_life.rainy_shop_employee where employee_name like #{keywords}")
    List<RainyShopEmployee> queryByName(String keyWords);
}




