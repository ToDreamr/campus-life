package com.rain.controller.shop;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rain.annotations.LogWhenUsed;
import com.rain.entity.common.Result;
import com.rain.entity.exception.BaseException;
import com.rain.entity.pojo.shop.RainyShopClassify;
import com.rain.service.RainyShopClassifyService;

import io.swagger.annotations.Api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 18:26
 */
@RestController
@RequestMapping("/shop/classify")
@Api(tags = "ClassifyController",description = "分类信息")
public class ClassifyController {
    @Resource
    private RainyShopClassifyService shopClassifyService;
    //查询分类

    //6月14日，尝试对代码的controller实现标准化开发，重构代码！！！
    @GetMapping
    @ResponseBody
    @LogWhenUsed(date = "2022-12-23")//调用就查询
    public Result<List<RainyShopClassify>> getClassify(){
        return Result.success("查询成功",shopClassifyService.list());
    }

    @DeleteMapping ("{id}")
    @ResponseBody
    public Result<List<RainyShopClassify>> remove(@PathVariable String id){
        return shopClassifyService.remove(id);
    }
    @PutMapping
    @ResponseBody
    public Result<String> modifyClassify(@RequestBody RainyShopClassify classify){
        return Result.success(shopClassifyService.modifyClassify(classify));
    }
    @PostMapping
    @ResponseBody
    public Result<RainyShopClassify> postClassify(@Validated @RequestBody  RainyShopClassify classify){
        return shopClassifyService.postClassify(classify);
    }

    @PostMapping("/insert")
    @ResponseBody
    public String hello(@RequestParam String shopType,@RequestParam Integer id){
        RainyShopClassify rainyShopClassify = new RainyShopClassify();
        rainyShopClassify.setShopType(shopType);
        rainyShopClassify.setId(id);
        shopClassifyService.save(rainyShopClassify);
        return "redirect:success.html";
    }
}
