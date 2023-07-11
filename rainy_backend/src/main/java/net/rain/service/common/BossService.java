package net.rain.service.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import net.rain.entity.pojo.shop.RainyShopAppeal;
import org.springframework.stereotype.Service;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/3 10:35
 */
@Service
public interface BossService extends IService<RainyShopAppeal> {
    //继承自appeal
    Page<RainyShopAppeal> getPage(int page, int pageSize);
    //撤销申诉：
    String deleteAppeal( int id);

    RainyShopAppeal modifyActivity(Integer id);
}
