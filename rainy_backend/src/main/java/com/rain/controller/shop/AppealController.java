package com.rain.controller.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopAppeal;
import com.rain.service.BossService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/30 15:26
 */
@RestController
@RequestMapping("/shop/appeal")
@Api(tags = "AppealController",description = "")
public class AppealController {
    @Resource
    private BossService bossService;
    @GetMapping("/page")
    public Result<Page<RainyShopAppeal>> pageAppeal(int page, int pageSize){
        return Result.success(bossService.getPage(page, pageSize));
    }
}
