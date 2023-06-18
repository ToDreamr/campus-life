package com.rain.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopClassify;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_classify(店铺分类)】的数据库操作Service
* @createDate 2023-04-24 16:16:34
*/
public interface RainyShopClassifyService extends IService<RainyShopClassify> {
    //修改分类信息
    String modifyClassify( RainyShopClassify classify);
    Result<RainyShopClassify> postClassify(RainyShopClassify classify);
    Result<List<RainyShopClassify>> remove( Integer id);
}
