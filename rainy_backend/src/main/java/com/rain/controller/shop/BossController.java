package com.rain.controller.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopGoods;
import com.rain.service.BossService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/30 15:21
 */
@RestController
@RequestMapping("/shop/boss")
@Api(tags = "BossController",description = "")
public class BossController {
    @Resource
    private BossService bossService;
    //涉及到多个表单联合查询，需要考虑数据库设计！
}
