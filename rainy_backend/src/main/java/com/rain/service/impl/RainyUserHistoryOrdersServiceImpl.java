package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.user.RainyUserHistoryOrders;
import com.rain.mapper.user.RainyUserHistoryOrdersMapper;
import com.rain.service.RainyUserHistoryOrdersService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:41
 */
@Service
public class RainyUserHistoryOrdersServiceImpl extends ServiceImpl<RainyUserHistoryOrdersMapper, RainyUserHistoryOrders> implements RainyUserHistoryOrdersService {
    @Resource
    private RainyUserHistoryOrdersMapper historyOrdersMapper;
    @Override
    public Page<RainyUserHistoryOrders> getHistoryOrdersPage(int page, int pageSize) {
        LambdaQueryWrapper<RainyUserHistoryOrders> queryWrapper = new LambdaQueryWrapper<>();
        Page page1 = new Page<>(page,pageSize);
        return historyOrdersMapper.selectPage(page1, queryWrapper);
    }
}
