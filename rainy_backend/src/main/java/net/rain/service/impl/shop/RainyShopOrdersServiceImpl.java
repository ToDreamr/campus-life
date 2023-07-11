package net.rain.service.impl.shop;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.rain.entity.pojo.shop.RainyShopOrders;
import net.rain.mapper.shop.RainyShopOrdersMapper;
import net.rain.service.shop.RainyShopOrdersService;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:39
 */
@Service
public class RainyShopOrdersServiceImpl extends ServiceImpl<RainyShopOrdersMapper, RainyShopOrders> implements RainyShopOrdersService {
}
