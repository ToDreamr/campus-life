package net.rain.controller.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopAppeal;
import net.rain.service.common.BossService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/30 15:26
 */
@RestController
@RequestMapping("/shop/appeal")
@Api(tags = "Appeal",description = "申诉管理")
public class AppealController {
    @Resource
    private BossService bossService;

    /**
     * 分页查询申诉请求
     * @param page 起始页码
     * @param pageSize 页码长度
     * @return 返回所需要的 页码长度
     */
    @GetMapping("/page")
    public Result<Page<RainyShopAppeal>> pageAppeal(int page, int pageSize){
        return Result.success(bossService.getPage(page, pageSize));
    }

    /** controller内部可以继续优化信息
     * 接受前端传输的参数，前端传入参数比较杂乱
     * @param id 申诉单号
     * @return 返回修改好的实体
     */
    @PostMapping("/status/{id}")
    public Result<RainyShopAppeal> modifyActivity(@PathVariable Integer id){
        return Result.success("顾客状态修改成功！",bossService.modifyActivity(id));
    }

    /**
     * 撤销原来的申诉
     * @param id 申诉单号
     * @return 返回撤销信息
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteAppeal(@PathVariable int id){
        //设置返回数据为空
        return Result.success(bossService.deleteAppeal(id),null);
    }
}
