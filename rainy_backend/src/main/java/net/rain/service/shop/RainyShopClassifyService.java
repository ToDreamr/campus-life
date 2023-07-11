package net.rain.service.shop;



import com.baomidou.mybatisplus.extension.service.IService;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopClassify;

import java.util.List;


/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_classify(店铺分类)】的数据库操作Service
* @createDate 2023-04-24 16:16:34
*/
public interface RainyShopClassifyService extends IService<RainyShopClassify> {
    //修改分类信息
    Result<RainyShopClassify> modifyClassify(RainyShopClassify classify);
    Result<RainyShopClassify> postClassify(RainyShopClassify classify);
    Result<List<RainyShopClassify>> remove( Integer id);
}
