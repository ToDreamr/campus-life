package com.rain.service;

import com.rain.entity.common.Result;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/18 15:13
 */
@Service
public interface FileUploadService {
    Result<String> uploadFile(String fileName,String destination) throws IOException;
    void printHello();
}
