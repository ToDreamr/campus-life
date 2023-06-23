package com.rain.mapper.shop;

import com.rain.entity.pojo.shop.RainyShopEmployee;
import com.rain.entity.pojo.shop.RainyShopGoodComment;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_good_comment(商品评论表)】的数据库操作Mapper
* @createDate 2023-04-24 16:23:44
* @Entity com.rain.service.RainyShopGoodComment
*/
@Repository
public interface RainyShopGoodCommentMapper extends BaseMapper<RainyShopGoodComment> {

}




