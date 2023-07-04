package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.shop.RainyShopAppeal;
import com.rain.entity.pojo.shop.RainyShopGoods;
import com.rain.mapper.shop.AppealMapper;
import com.rain.service.BossService;
import com.rain.service.ValidService;
import lombok.val;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/3 10:37
 */
@Service
public class BossServiceImpl extends ServiceImpl<AppealMapper, RainyShopAppeal> implements BossService {
    @Resource
    private AppealMapper appealMapper;
    //重复性代码简化操作
    @Resource
    private ValidService validService;
    @Override
    public Page<RainyShopAppeal> getPage(int page, int pageSize) {
        LambdaQueryWrapper<RainyShopAppeal> queryWrapper = new LambdaQueryWrapper<RainyShopAppeal>();
        Page pageInfo=new Page<>(page,pageSize);
        return appealMapper.selectPage(pageInfo,queryWrapper);
    }
}
