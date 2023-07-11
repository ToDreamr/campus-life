package net.rain.entity.pojo.shop;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName rainy_shop_history_orders
*/
@ToString
@ApiModel(value = "历史订单",description = " ")
public class RainyShopHistoryOrders implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("订单号")
    private Integer id;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("用户id")
    private Integer userId;
    /**
    * 
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("标签")
    @Length(max= 20,message="编码长度不能超过20")
    private String signature;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("买家电话")
    @Length(max= 11,message="编码长度不能超过11")
    private String userPhone;
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
    public void setUserId(Integer userId){
    this.userId = userId;
    }

    /**
    * 
    */
    public void setSignature(String signature){
    this.signature = signature;
    }

    /**
    * 
    */
    public void setUserPhone(String userPhone){
    this.userPhone = userPhone;
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
    public Integer getUserId(){
    return this.userId;
    }

    /**
    * 
    */
    public String getSignature(){
    return this.signature;
    }

    /**
    * 
    */
    public String getUserPhone(){
    return this.userPhone;
    }

    /**
    * 
    */
    public String getGender(){
    return this.gender;
    }

}
