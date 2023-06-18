package com.rain;

import com.rain.service.FileUploadService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootTest
class LifeBackendApplicationTests {
    @Resource
    FileUploadService uploadService;
    @Test
    void contextLoads() throws IOException {
        uploadService.printHello();
    }

}
