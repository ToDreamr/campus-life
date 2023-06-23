package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.common.Result;
import com.rain.entity.dto.EmployeeDTO;
import com.rain.entity.pojo.shop.RainyShopEmployee;
import com.rain.mapper.shop.RainyShopEmployeeMapper;
import com.rain.service.RainyShopEmployeeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:32
 */
@Service
public class RainyShopEmployeeServiceImpl extends ServiceImpl<RainyShopEmployeeMapper, RainyShopEmployee> implements RainyShopEmployeeService {
    @Autowired
    RainyShopEmployeeMapper employeeMapper;
    @Autowired
    private ValidService validService;
    @Override
    public Result<RainyShopEmployee> postEmployee(RainyShopEmployee employee) {
        //接收前端传入的json格式数据参数，封装为员工类将其通过mybatis来保存。
        return validService.postByIdAndMapper(employee,employee.getId(),employeeMapper);
    }

    @Override
    //不可以返回密码信息，这一点是 需要改正的
    public Result<List<RainyShopEmployee>> getEmployee() {
        LambdaQueryWrapper<RainyShopEmployee> queryWrapper=new LambdaQueryWrapper<>();
        List<RainyShopEmployee> employees = employeeMapper.selectList(queryWrapper);
        //去除密码这样的敏感信息
        List<RainyShopEmployee> result = employees.stream().map(r -> {
            r.setPassword(null);
            //设置字段为null，但实体类不会转换null为json返回给前端，
            // 因为实体类加了注解@JsonInclude(JsonInclude.Include.NON_NULL)
            return r;
        }).collect(Collectors.toList());
        return Result.success("已返回所属员工信息", result);
    }

    /**
     * 修改员工信息
     */
    @Override
    public Result<RainyShopEmployee> modifyEmployee(RainyShopEmployee rainyShopEmployee) {
       return validService.modifyByIdAndMapper(rainyShopEmployee,employeeMapper,rainyShopEmployee.getId());
    }

    /**
     * 删除员工数据
     * @param id
     * @return
     */
    @Override
    public Result<List<RainyShopEmployee>> deleteEmployee(int id) {
        //查询ID
        //返回删除之后的员工列表
        return validService.deleteByIdAndMapper(id,employeeMapper);
    }

    @Override
    public RainyShopEmployee getById(int id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public List<RainyShopEmployee> queryByName(String keyWords) {
        return employeeMapper.queryByName(keyWords);
    }


    @Override
    public List<RainyShopEmployee> classifyPage(int page, int pageSize) {

        List<RainyShopEmployee> rainyShopEmployees = employeeMapper.classifyPage(page, pageSize);
        return rainyShopEmployees;
    }

}
