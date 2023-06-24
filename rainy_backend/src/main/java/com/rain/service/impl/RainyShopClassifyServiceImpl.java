package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.common.Result;
import com.rain.entity.exception.BaseException;
import com.rain.entity.pojo.shop.RainyShopClassify;
import com.rain.mapper.shop.RainyShopClassifyMapper;
import com.rain.service.RainyShopClassifyService;
import com.rain.service.ValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:30
 */
@Service
public class RainyShopClassifyServiceImpl extends ServiceImpl<RainyShopClassifyMapper, RainyShopClassify> implements RainyShopClassifyService {
    //分类依赖：
    @Autowired
    RainyShopClassifyMapper classifyMapper;
    @Autowired
    ValidService validService;

    public Result<RainyShopClassify> modifyClassify(RainyShopClassify classify){
        return validService.modifyByIdAndMapper(classify,classifyMapper, classify.getId());
    }

    @Override
    public Result<RainyShopClassify> postClassify(RainyShopClassify classify) {
        return validService.postByIdAndMapper(classify, classify.getId(),classifyMapper);
    }

    @Override
    public Result<List<RainyShopClassify>> remove(Integer id) {
        return validService.deleteByIdAndMapper(id,classifyMapper);
    }
}
