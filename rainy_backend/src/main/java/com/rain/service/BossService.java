package com.rain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopAppeal;
import com.rain.entity.pojo.shop.RainyShopGoods;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/3 10:35
 */
@Service
public interface BossService extends IService<RainyShopAppeal> {
    //继承自appeal
    Page<RainyShopAppeal> getPage(int page, int pageSize);
    //撤销申诉：
    String deleteAppeal( int id);
}
