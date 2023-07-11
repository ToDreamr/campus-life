package net.rain.controller.shop;

import io.swagger.annotations.Api;
import net.rain.service.rpc.RemoteProcedureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/30 15:21
 */
@RestController
@RequestMapping("/shop/boss")
@Api(tags = "Boss",description = "商家后台和RPC")
public class BossController {
    //涉及到多个表单联合查询，需要考虑数据库设计！

    @Resource
    private RemoteProcedureService remoteProcedureService;
    @GetMapping("/weather")
    public Mono<String> getWeather(@RequestParam("city")String cityName){
        return remoteProcedureService.getWeather(cityName);
    }
}
