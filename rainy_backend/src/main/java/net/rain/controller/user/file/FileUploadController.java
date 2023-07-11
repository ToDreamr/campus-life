package net.rain.controller.user.file;

import io.swagger.annotations.Api;
import net.rain.entity.common.Result;
import net.rain.service.common.FileUploadService;
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
@Api(tags = "File",description = "文件上传")
public class FileUploadController {
    @Resource
    FileUploadService uploadService;

    @PostMapping
    @ResponseBody
    public Result<String> postFile(@RequestParam String from, @RequestParam String to) throws IOException {
        return uploadService.uploadFile(from, to);
    }
}
