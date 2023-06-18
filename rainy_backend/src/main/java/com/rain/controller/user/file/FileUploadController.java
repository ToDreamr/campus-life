package com.rain.controller.user.file;

import com.rain.entity.common.Result;
import com.rain.service.FileUploadService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/18 15:12
 */
@RestController
@RequestMapping("/user/file")
public class FileUploadController {
    @Resource
    FileUploadService uploadService;

    @PostMapping
    @ResponseBody
    public Result<String> postFile(@RequestParam String from,@RequestParam String to) throws IOException {
        return uploadService.uploadFile(from, to);
    }
}
