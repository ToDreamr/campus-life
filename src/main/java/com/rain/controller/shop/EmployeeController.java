package com.rain.controller.shop;

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

    @GetMapping
    @ResponseBody
    public Result<List<RainyShopEmployee>> getEmployee() {
        return employeeService.getEmployee();
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
}
