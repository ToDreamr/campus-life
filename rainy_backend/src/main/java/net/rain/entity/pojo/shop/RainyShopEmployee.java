package net.rain.entity.pojo.shop;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 员工表
* @TableName rainy_shop_employee
*/
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "商家员工管理",description ="")
public class RainyShopEmployee implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("id")
    private Integer id;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("员工姓名")
    @Length(max= 255,message="编码长度不能超过255")
    private String employeeName;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户姓名")
    @Length(max= 255,message="编码长度不能超过255")
    private String username;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("密码")
    @Length(max= 255,message="编码长度不能超过255")
    private String password;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("是否在职")
    private Integer isdroped;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("电话号码")
    @Length(max= 11,message="编码长度不能超过11")
    private String phone;
    /**
    * 
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("邮箱")
    @Length(max= 20,message="编码长度不能超过20")
    private String email;
    /**
    * 
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("性别")
    @Length(max= 10,message="编码长度不能超过10")
    private String gender;

    /**
    * 
    */
    public void setId(Integer id){
    this.id = id;
    }

    /**
    * 
    */
    public void setEmployeeName(String employeeName){
    this.employeeName = employeeName;
    }

    /**
    * 
    */
    public void setUsername(String username){
    this.username = username;
    }

    /**
    * 
    */
    public void setPassword(String password){
    this.password = password;
    }

    /**
    * 
    */
    public void setIsdroped(Integer isdroped){
    this.isdroped = isdroped;
    }

    /**
    * 
    */
    public void setPhone(String phone){
    this.phone = phone;
    }

    /**
    * 
    */
    public void setEmail(String email){
    this.email = email;
    }

    /**
    * 
    */
    public void setGender(String gender){
    this.gender = gender;
    }


    /**
    * 
    */
    public Integer getId(){
    return this.id;
    }

    /**
    * 
    */
    public String getEmployeeName(){
    return this.employeeName;
    }

    /**
    * 
    */
    public String getUsername(){
    return this.username;
    }

    /**
    * 
    */
    public String getPassword(){
    return this.password;
    }

    /**
    * 
    */
    public Integer getIsdroped(){
    return this.isdroped;
    }

    /**
    * 
    */
    public String getPhone(){
    return this.phone;
    }

    /**
    * 
    */
    public String getEmail(){
    return this.email;
    }

    /**
    * 
    */
    public String getGender(){
    return this.gender;
    }



}
