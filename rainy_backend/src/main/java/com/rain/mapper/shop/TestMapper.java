package com.rain.mapper.shop;

import com.rain.entity.pojo.shop.RainyShopClassify;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/10 15:27
 */
@Repository
public interface TestMapper {
    @Select("select *from school_life.rainy_shop_classify")
    List<RainyShopClassify> getAll();
}
