package com.rain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/14 15:43
 */
//开启swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 指定扫描的包路径来定义指定要建立API的目录。
     * @return
     */

    /*
    * 因为Springfox使用的路径匹配是基于AntPathMatcher的，而Spring Boot 2.6.X使用的是PathPatternMatcher。
    * 需要配置：为基于antpathMatcher*/
    @Bean
    public Docket docket() {
        //swagger的实例是docket，所以需要创建docket
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).groupName("商家");
//                .enable(true)
//                .pathMapping("/")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.rain.controller"))
//                .paths(PathSelectors.ant("/shop/**"))
//                .build().groupName("商家");
    }


    private ApiInfo apiInfo() {
        Contact contact = new Contact("Riany-Heights", "校园生活", "amixrip@163.com");
        return new ApiInfo(
                "校园生活后端",
                "校园生活，此项目的后端",
                "v1.0",
                "https://www.yuque.com/chunjianghuazhaoqiuyueye",
                contact,
                "Apach 2.0 许可",
                "许可链接",
                new ArrayList<>()
        );
    }
}
