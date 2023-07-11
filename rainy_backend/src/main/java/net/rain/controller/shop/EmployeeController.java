package net.rain.controller.shop;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopEmployee;
import net.rain.service.shop.RainyShopEmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.List;


/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/2 16:25
 */
@RestController
@RequestMapping("/shop/employee")
@Api(tags = "Employee",description = "员工控制")
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
        //比较臃肿，还可以继续优化设计
        Page<RainyShopEmployee> page1 = new Page<>(page,pageSize);
        page1.setTotal(employeeService.count());//设置总数
        List<RainyShopEmployee> employeeList=employeeService.classifyPage(page,pageSize);//替换数据，不传回隐私数据
        page1.setRecords(employeeList);
        return Result.success(page1);
    }

    @GetMapping("/key")
    public Result<List<RainyShopEmployee>> queryByKeyWords(@RequestParam String keyWords){
        //参数需要反序列化
        System.out.println(keyWords);
        String str=java.net.URLDecoder.decode(keyWords,StandardCharsets.UTF_8);
        JSONObject jsonObject = JSONObject.parseObject(str);

        return Result.success("查询成功",employeeService.queryByName(keyWords));
    }
}
