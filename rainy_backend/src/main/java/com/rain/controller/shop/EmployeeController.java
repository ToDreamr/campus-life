package com.rain.controller.shop;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rain.entity.common.Result;
import com.rain.entity.pojo.shop.RainyShopEmployee;
import com.rain.service.RainyShopEmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/2 16:25
 */
@RestController
@RequestMapping("/shop/employee")
@Api(tags = "EmployeeController",description = "员工控制")
public class EmployeeController {
    @Autowired
    private RainyShopEmployeeService employeeService;

    @PostMapping
    @ResponseBody
    public Result<RainyShopEmployee> postEmployee(@RequestBody RainyShopEmployee employee){
        return employeeService.postEmployee(employee);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Result<RainyShopEmployee> getEmployee(@PathVariable("id") int id) {
        return Result.success(employeeService.getById(id));
    }

    @PutMapping
    @ResponseBody
    public Result<RainyShopEmployee> modifyEmployee(@RequestBody RainyShopEmployee rainyShopEmployee){
        return employeeService.modifyEmployee(rainyShopEmployee);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Result<List<RainyShopEmployee>> deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/page")
    public Result<Page<RainyShopEmployee>> pageEmployee(int page, int pageSize){
        LambdaQueryWrapper<RainyShopEmployee> queryWrapper=new LambdaQueryWrapper<>();
        Page<RainyShopEmployee> pageInfo=new Page<>(page,pageSize);
        return Result.success(employeeService.page(pageInfo,queryWrapper));
    }
}
