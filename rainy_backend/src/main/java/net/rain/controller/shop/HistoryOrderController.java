package net.rain.controller.shop;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.user.RainyUserHistoryOrders;
import net.rain.service.user.RainyUserHistoryOrdersService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/30 15:27
 */
@RestController
@RequestMapping("/shop/history")
@Api(tags = "HistoryOrder",description = "历史订单明细")
public class HistoryOrderController {
    @Resource
    private RainyUserHistoryOrdersService userHistoryOrdersService;
    @GetMapping("/page")
    public Result<Page<RainyUserHistoryOrders>> getHistoryOrdersPAge(int page, int pageSize){
        return Result.success("查询成功",userHistoryOrdersService.getHistoryOrdersPage(page, pageSize));
    }
}
