package com.rain.entity.pojo.shop;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 商家订单表
* @TableName rainy_shop_orders
*/
@ToString
public class RainyShopOrders implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer id;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Date orderTime;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("")
    @Length(max= 20,message="编码长度不能超过20")
    private String userAddress;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("")
    @Length(max= 11,message="编码长度不能超过11")
    private String userPhone;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Double allMoney;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer userId;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String goodsName;

    /**
    * 
    */
    public void setId(Integer id){
    this.id = id;
    }

    /**
    * 
    */
    public void setOrderTime(Date orderTime){
    this.orderTime = orderTime;
    }

    /**
    * 
    */
    public void setUserAddress(String userAddress){
    this.userAddress = userAddress;
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
    public void setAllMoney(Double allMoney){
    this.allMoney = allMoney;
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
    public void setGoodsName(String goodsName){
    this.goodsName = goodsName;
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
    public Date getOrderTime(){
    return this.orderTime;
    }

    /**
    * 
    */
    public String getUserAddress(){
    return this.userAddress;
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
    public Double getAllMoney(){
    return this.allMoney;
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
    public String getGoodsName(){
    return this.goodsName;
    }

}
