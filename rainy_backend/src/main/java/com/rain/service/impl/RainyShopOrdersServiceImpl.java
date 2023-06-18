package com.rain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.shop.RainyShopOrders;
import com.rain.mapper.shop.RainyShopOrdersMapper;
import com.rain.service.RainyShopOrdersService;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:39
 */
@Service
public class RainyShopOrdersServiceImpl extends ServiceImpl<RainyShopOrdersMapper, RainyShopOrders> implements RainyShopOrdersService {
}
