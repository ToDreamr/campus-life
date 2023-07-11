package net.rain.service.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopGoods;

import java.util.List;

/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_goods(商品表)】的数据库操作Service
* @createDate 2023-04-24 16:18:37
*/
public interface RainyShopGoodsService extends IService<RainyShopGoods> {
    Result<RainyShopGoods> postGoods(RainyShopGoods Goods);
    Result<RainyShopGoods> modifyGoods( RainyShopGoods rainyShopGoods);
    Result<List<RainyShopGoods>> deleteGoods( int id);
    RainyShopGoods getById(int id);
    List<RainyShopGoods> queryByName(String keyWords);
    Page<RainyShopGoods> getPage(int page, int pageSize);
}
