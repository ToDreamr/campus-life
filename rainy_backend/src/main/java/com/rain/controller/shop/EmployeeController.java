package com.rain.controller.shop;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rain.entity.common.Result;
import com.rain.entity.dto.EmployeeDTO;
import com.rain.entity.pojo.shop.RainyShopEmployee;
import com.rain.mapper.shop.RainyShopEmployeeMapper;
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
    @Autowired
    private RainyShopEmployeeMapper employeeMapper;

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
        Page<RainyShopEmployee> page1 = new Page<>(page,pageSize);
        page1.setTotal(employeeService.count());//设置总数
        List<RainyShopEmployee> employeeList=employeeService.classifyPage(page,pageSize);//替换数据，不传回隐私数据
        page1.setRecords(employeeList);
        return Result.success(page1);
    }

    @GetMapping("/key")
    public Result<List<RainyShopEmployee>> queryByKeyWords(@RequestParam String keyWords){
        System.out.println(keyWords);
        return Result.success("查询成功",employeeService.queryByName(keyWords));
    }
}
