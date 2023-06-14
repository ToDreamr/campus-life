package com.rain.service;

import com.rain.entity.pojo.shop.RainyShopGoodComment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_good_comment(商品评论表)】的数据库操作Service
* @createDate 2023-04-24 16:18:37
*/
public interface RainyShopGoodCommentService extends IService<RainyShopGoodComment> {

    RainyShopGoodComment post(RainyShopGoodComment comment);
    String delete(Integer id);
    RainyShopGoodComment modify( RainyShopGoodComment comment);
    List<RainyShopGoodComment> list(Integer id);
}
