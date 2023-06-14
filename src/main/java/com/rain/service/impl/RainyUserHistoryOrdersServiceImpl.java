package com.rain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.user.RainyUserHistoryOrders;
import com.rain.mapper.user.RainyUserHistoryOrdersMapper;
import com.rain.service.RainyUserHistoryOrdersService;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:41
 */
@Service
public class RainyUserHistoryOrdersServiceImpl extends ServiceImpl<RainyUserHistoryOrdersMapper, RainyUserHistoryOrders> implements RainyUserHistoryOrdersService {
}
