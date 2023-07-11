package net.rain.controller.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopGoods;
import net.rain.service.shop.RainyShopGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value = "上传商品")
    public Result<RainyShopGoods> postGoods(@RequestBody RainyShopGoods Goods){
        return goodsService.postGoods(Goods);
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "根据ID获取")
    public Result<RainyShopGoods> getGoods(@PathVariable("id") int id) {
        return Result.success(goodsService.getById(id));
    }

    @PutMapping
    @ResponseBody
    @ApiOperation(value = "修改商品")
    public Result<RainyShopGoods> modifyGoods(@RequestBody RainyShopGoods rainyShopGoods){
        return goodsService.modifyGoods(rainyShopGoods);
    }

    @DeleteMapping
    @ResponseBody
    @ApiOperation(value = "删除商品")
    public Result<List<RainyShopGoods>> deleteGoods(@RequestParam int ids){
        return goodsService.deleteGoods(ids);
    }

    @GetMapping("/page")
    @ApiOperation(value = "分页查询商品")
    public Result<Page<RainyShopGoods>> pageGoods(int page, int pageSize){
      return Result.success(goodsService.getPage(page,pageSize));
    }

    @GetMapping("/key")
    @ApiOperation(value = "关键字查询商品")
    public Result<List<RainyShopGoods>> queryByKeyWords(@RequestParam String keyWords){
        System.out.println(keyWords);
        return Result.success("查询成功",goodsService.queryByName(keyWords));
    }

    @PostMapping("/status/{id}")
    @ApiOperation(value = "根据id查询商品上架状态")
    public Result<RainyShopGoods> modifyStatus(@PathVariable int id){
        RainyShopGoods goods = goodsService.getById(id);
        goods.setGoodsIsdroped(1);
        goodsService.modifyGoods(goods);
        return Result.success("修改成功",goods);
    }
}
