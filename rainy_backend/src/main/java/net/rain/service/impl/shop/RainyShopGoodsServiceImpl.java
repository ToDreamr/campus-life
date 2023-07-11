package net.rain.service.impl.shop;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopGoods;
import net.rain.mapper.shop.RainyShopGoodsMapper;
import net.rain.service.shop.RainyShopGoodsService;

import net.rain.service.common.ValidService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:35
 */
@Service
public class RainyShopGoodsServiceImpl extends ServiceImpl<RainyShopGoodsMapper, RainyShopGoods> implements RainyShopGoodsService {
    //调用逻辑关系：控制层调用Service,Service通过统一公共方法ValidService来调用Mapper层面

    @Resource
    private RainyShopGoodsMapper goodsMapper;
    @Resource
    private ValidService validService;

    /**
     * 添加商品
     * @param goods 商品实例
     * @return
     */
    @Override
    public Result<RainyShopGoods> postGoods(RainyShopGoods goods) {
        return validService.postByIdAndMapper(goods, goods.getId(), goodsMapper);

    }

    /**
     * 修改
     * @param rainyShopGoods 实体
     * @return 修改之后的实体
     */
    @Override
    public Result<RainyShopGoods> modifyGoods(RainyShopGoods rainyShopGoods) {
        return validService.modifyByIdAndMapper(rainyShopGoods,goodsMapper, rainyShopGoods.getId());
    }

    /**
     * 删除
     * @param id 编号
     * @return 删除之后的列表
     */
    @Override
    public Result<List<RainyShopGoods>> deleteGoods(int id) {
        return validService.deleteByIdAndMapper(id,goodsMapper);
    }

    /*
    * 自定义查询*/
    @Override
    public RainyShopGoods getById(int id) {
        return goodsMapper.selectById(id);
    }

    @Override
    public List<RainyShopGoods> queryByName(String keyWords) {
        return goodsMapper.queryByName(keyWords);
    }

    public Page<RainyShopGoods> getPage(int page,int pageSize){
        LambdaQueryWrapper<RainyShopGoods> queryWrapper = new LambdaQueryWrapper<>();
        Page pageInfo=new Page<>(page,pageSize);
        return goodsMapper.selectPage(pageInfo,queryWrapper);
    }

}

