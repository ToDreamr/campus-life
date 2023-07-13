package net.rain.controller.common;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.rain.ResourceTest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

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
        URL url = ResourceTest.class.getClassLoader().getResource("./png/"+name+".png");
//        FileInputStream ins=new FileInputStream(new File(MultiFileController.class.getClassLoader().getResource("./png/"+name + ".png")+name+".png"));
        //断言不为空
        assert url != null;
        InputStream ins = url.openStream();
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

    @PostMapping ("/download")
    @ApiOperation(value = "下载图片到客户端")
    public void Name(@RequestBody String name, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = JSONObject.parseObject(name);
        URL url = ResourceTest.class.getClassLoader().getResource("./png/"+jsonObject.get("name")+".png");
        //构造输入流
//        FileInputStream ins=new FileInputStream(new File("D:\\JavaWork\\school_life\\rainy_backend\\src\\main\\resources\\png\\"+jsonObject.get("name")+".png"));
        assert url!=null;
        InputStream ins = url.openStream();
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
