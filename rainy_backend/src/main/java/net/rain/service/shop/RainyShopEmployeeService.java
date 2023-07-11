package net.rain.service.shop;


import com.baomidou.mybatisplus.extension.service.IService;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopEmployee;

import java.util.List;

/**
* @author Rainy-Heights
* @description 针对表【rainy_shop_employee(员工表)】的数据库操作Service
* @createDate 2023-04-24 16:18:37
*/
public interface RainyShopEmployeeService extends IService<RainyShopEmployee> {
    Result<RainyShopEmployee> postEmployee( RainyShopEmployee employee);
    Result<List<RainyShopEmployee>> getEmployee();
    Result<RainyShopEmployee> modifyEmployee( RainyShopEmployee rainyShopEmployee);
    Result<List<RainyShopEmployee>> deleteEmployee( int id);
    RainyShopEmployee getById(int id);
    List<RainyShopEmployee> queryByName(String keyWords);
    List<RainyShopEmployee> classifyPage(int page, int pageSize);
}
