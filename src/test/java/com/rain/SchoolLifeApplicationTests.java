package com.rain;

import com.rain.entity.common.Result;
import com.rain.mapper.shop.TestMapper;
import com.rain.service.FileUploadService;
import com.rain.service.RainyShopGoodsService;
import com.rain.service.RainyShopHistoryOrdersService;
import com.rain.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootTest
class SchoolLifeApplicationTests {
    @Resource
    FileUploadService uploadService;
    @Test
    void contextLoads() throws IOException {
       String from="D:\\JavaWork\\school_life\\src\\main\\resources\\22.jpg";
       String to="D:\\JavaWork\\school_life\\src\\main\\resources\\des.jpg";
        Result<String> stringResult = uploadService.uploadFile(from, to);
    }

}
