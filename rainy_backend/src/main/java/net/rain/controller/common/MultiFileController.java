package net.rain.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@Api(tags = "MultiFile",description = "文件操作相关")
public class MultiFileController {
    //像浏览器页面写图片数据
    @GetMapping("/download")
    @ApiOperation(value = "下载图片到客户端")
    public void downLoad(@RequestParam  String name, HttpServletResponse response) throws IOException {
        //构造输入流
        FileInputStream ins=new FileInputStream(new File("D:\\JavaWork\\school_life\\rainy_backend\\src\\main\\resources\\png\\"+name+".png"));
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
