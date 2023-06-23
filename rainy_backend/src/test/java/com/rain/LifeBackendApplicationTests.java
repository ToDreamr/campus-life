package com.rain;

import com.rain.service.FileUploadService;

import com.rain.service.RainyShopEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootTest
class LifeBackendApplicationTests {
    @Resource
    FileUploadService uploadService;
    @Resource
    RainyShopEmployeeService employeeService;
    @Test
    void contextLoads() throws IOException {
        System.out.println(employeeService.classifyPage(2, 8));
    }

}
