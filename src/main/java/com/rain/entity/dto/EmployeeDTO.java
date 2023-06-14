package com.rain.entity.dto;

import com.rain.entity.pojo.shop.RainyShopEmployee;
import lombok.Data;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/4 0:54
 */
@Data
public class EmployeeDTO extends RainyShopEmployee {
    private String phone;
    private String employeeName;
    private Integer id;
    private String gender;
    private Integer isdroped;
}
