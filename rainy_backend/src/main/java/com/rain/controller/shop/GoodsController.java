package com.rain.controller.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopGoods;
import com.rain.service.RainyShopGoodsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/20 20:21
 */
@RestController
@RequestMapping("/shop/goods")
@Api(tags = "GoodsController",description = "商品明细")
public class GoodsController {
    @Autowired
    private RainyShopGoodsService goodsService;


    @PostMapping
    @ResponseBody
    public Result<RainyShopGoods> postGoods(@RequestBody RainyShopGoods Goods){
        return goodsService.postGoods(Goods);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Result<RainyShopGoods> getGoods(@PathVariable("id") int id) {
        return Result.success(goodsService.getById(id));
    }

    @PutMapping
    @ResponseBody
    public Result<RainyShopGoods> modifyGoods(@RequestBody RainyShopGoods rainyShopGoods){
        return goodsService.modifyGoods(rainyShopGoods);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Result<List<RainyShopGoods>> deleteGoods(@PathVariable int id){
        return goodsService.deleteGoods(id);
    }

    @GetMapping("/page")
    public Result<Page<RainyShopGoods>> pageGoods(int page, int pageSize){
      return Result.success(goodsService.getPage(page,pageSize));
    }

    @GetMapping("/key")
    public Result<List<RainyShopGoods>> queryByKeyWords(@RequestParam String keyWords){
        System.out.println(keyWords);
        return Result.success("查询成功",goodsService.queryByName(keyWords));
    }

    @PostMapping("/status/{id}")
    public Result<RainyShopGoods> modifyStatus(@PathVariable int id){
        RainyShopGoods goods = goodsService.getById(id);
        goods.setGoodsIsdroped(1);
        goodsService.modifyGoods(goods);
        return Result.success("修改成功",goods);
    }
}
