package net.rain.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import net.rain.entity.pojo.user.RainyUserHistoryOrders;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* @author Rainy-Heights
* @description 针对表【rainy_user_history_orders(历史订单)】的数据库操作Service
* @createDate 2023-04-24 16:18:37
*/
public interface RainyUserHistoryOrdersService extends IService<RainyUserHistoryOrders> {
    Page<RainyUserHistoryOrders> getHistoryOrdersPage(int page,int pageSize);
}
