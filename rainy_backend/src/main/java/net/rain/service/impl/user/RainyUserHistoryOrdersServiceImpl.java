package net.rain.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.rain.entity.pojo.user.RainyUserHistoryOrders;
import net.rain.mapper.user.RainyUserHistoryOrdersMapper;
import net.rain.service.user.RainyUserHistoryOrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:41
 */
@Service
public class RainyUserHistoryOrdersServiceImpl extends ServiceImpl<RainyUserHistoryOrdersMapper, RainyUserHistoryOrders> implements RainyUserHistoryOrdersService {
    @Resource
    private RainyUserHistoryOrdersMapper historyOrdersMapper;
    @Override
    public Page<RainyUserHistoryOrders> getHistoryOrdersPage(int page, int pageSize) {
        LambdaQueryWrapper<RainyUserHistoryOrders> queryWrapper = new LambdaQueryWrapper<>();
        Page page1 = new Page<>(page,pageSize);
        return historyOrdersMapper.selectPage(page1, queryWrapper);
    }
}
