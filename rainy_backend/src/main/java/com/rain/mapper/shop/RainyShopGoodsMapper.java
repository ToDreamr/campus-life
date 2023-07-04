package com.rain.mapper.shop;

import com.rain.entity.pojo.shop.RainyShopGoods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_goods(商品表)】的数据库操作Mapper
* @createDate 2023-04-24 16:23:44
* @Entity com.rain.service.RainyShopGoods
*/
@Repository
public interface RainyShopGoodsMapper extends BaseMapper<RainyShopGoods> {
    @Select("select * from school_life.rainy_shop_goods where goods_name like #{keywords}")
    List<RainyShopGoods> queryByName(String keyWords);
}




