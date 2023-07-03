package com.rain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.pojo.shop.Appeal;
import com.rain.entity.pojo.shop.RainyShopEmployee;
import com.rain.mapper.shop.AppealMapper;
import com.rain.mapper.shop.RainyShopEmployeeMapper;
import com.rain.service.BossService;
import com.rain.service.RainyShopEmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/3 10:37
 */
@Service
public class BossServiceImpl extends ServiceImpl<AppealMapper, Appeal> implements BossService {

}
