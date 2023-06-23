package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopGoods;
import com.rain.mapper.shop.RainyShopGoodsMapper;
import com.rain.service.RainyShopGoodsService;

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

    @Resource
    private RainyShopGoodsMapper goodsMapper;
    @Resource
    ValidService validService;
    @Override
    public Result<RainyShopGoods> postGoods(RainyShopGoods Goods) {
        return null;

    }
    @Override
    public Result<List<RainyShopGoods>> getGoods() {
        return null;
    }

    @Override
    public Result<RainyShopGoods> modifyGoods(RainyShopGoods rainyShopGoods) {
        return validService.modifyByIdAndMapper(rainyShopGoods,goodsMapper, rainyShopGoods.getId());
    }

    @Override
    public Result<List<RainyShopGoods>> deleteGoods(int id) {
        return validService.deleteByIdAndMapper(id,goodsMapper);
    }

    @Override
    public RainyShopGoods getById(int id) {
        return null;
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

