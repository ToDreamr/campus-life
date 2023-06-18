package com.rain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.shop.RainyShopGoods;
import com.rain.mapper.shop.RainyShopGoodsMapper;
import com.rain.service.RainyShopGoodsService;

import static org.mockito.ArgumentMatchers.nullable;

import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock.Catch;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:35
 */
@Service
public class RainyShopGoodsServiceImpl extends ServiceImpl<RainyShopGoodsMapper, RainyShopGoods> implements RainyShopGoodsService {

}

