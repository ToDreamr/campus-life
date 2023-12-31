package net.rain.service.impl.common;

import net.rain.entity.common.Result;
import net.rain.service.common.FileUploadService;
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
            outputStream.close();
            inputStream.close();
            return Result.success("上传成功");
           }catch (IOException e) {
           e.printStackTrace();
           return Result.errorMsg("上传失败");
       }
    }
}
