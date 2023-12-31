package net.rain.entity.pojo.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 用户表
* @TableName user
*/
@ToString
@ApiModel(value = "用户",description = " ")
public class RainyUser implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("编号")
    private Integer id;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("用户名")
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
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("昵称")
    @Length(max= 255,message="编码长度不能超过255")
    private String nickName;
    /**
    * 
    */
    @ApiModelProperty("角色")
    private Integer userRole;

    @Setter
    @Getter
    @ApiModelProperty("邮箱")
    private String email;

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
