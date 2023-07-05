package com.rain.controller.common;

import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/20 20:15
 */
@RestController
@RequestMapping("/common")
public class MutilFileController {
    //像浏览器页面写图片数据
    @GetMapping("/download")
    public void downLoad(@RequestParam String name, HttpServletResponse response) throws IOException {
        //构造输入流
        FileInputStream ins=new FileInputStream(new File("D:\\JavaWork\\school_life\\rainy_backend\\src\\main\\resources\\png\\"+name));
        //构造输出流
        ServletOutputStream ous=response.getOutputStream();
        response.setContentType("image/jpeg");
        byte[]bytes=new byte[ins.available()];
        while ( ins.read(bytes) !=-1){
            ous.write(bytes);
            ous.flush();
        }
        ins.close();
        ous.close();
    }
}
