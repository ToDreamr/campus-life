package com.rain.service.impl;

import com.rain.entity.common.Result;
import com.rain.service.FileUploadService;
import org.springframework.stereotype.Service;

import java.io.*;


/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/18 15:19
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Override
    public Result<String> uploadFile(String fileName, String destination) {

       try {
            File file=new File(fileName);
            File des=new File(destination);
            FileOutputStream outputStream=new FileOutputStream(des);
            FileInputStream inputStream=new FileInputStream(file);
            byte[]bytes=new byte[inputStream.available()];
            while (inputStream.read(bytes)!=-1){
                outputStream.write(bytes);
            }
            return Result.success("上传成功");
           }catch (IOException e){
               e.printStackTrace();
               return Result.errorMsg("上传失败");
       }
    }

    @Override
    public void printHello() {
        System.out.println("I am being used.");
    }
}
