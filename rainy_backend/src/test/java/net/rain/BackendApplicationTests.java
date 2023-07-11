package net.rain;

import net.rain.service.common.FileUploadService;

import net.rain.service.shop.RainyShopEmployeeService;
import net.rain.service.shop.RainyShopGoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootTest
class BackendApplicationTests {
    @Resource
    FileUploadService uploadService;
    @Resource
    RainyShopEmployeeService employeeService;
    @Resource
    RainyShopGoodsService goodsService;
    @Test
    void contextLoads() throws IOException {
        System.out.println(goodsService.deleteGoods(12));
    }

}
