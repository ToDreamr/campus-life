package com.rain.entity.pojo.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 用户表
* @TableName user
*/
@ToString
public class RainyUser implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer id;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String username;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String password;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String nickName;
    /**
    * 
    */
    @ApiModelProperty("")
    private Integer userRole;

    /**
    * 
    */
    public void setId(Integer id){
    this.id = id;
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
    public void setNickName(String nickName){
    this.nickName = nickName;
    }

    /**
    * 
    */
    public void setUserRole(Integer userRole){
    this.userRole = userRole;
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
    public String getNickName(){
    return this.nickName;
    }

    /**
    * 
    */
    public Integer getUserRole(){
    return this.userRole;
    }

}
