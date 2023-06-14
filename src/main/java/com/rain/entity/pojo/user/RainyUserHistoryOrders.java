package com.rain.entity.pojo.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 历史订单
* @TableName rainy_user_history_orders
*/
@ToString
public class RainyUserHistoryOrders implements Serializable {

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
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Double allMoney;

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
    public void setGoodsName(String goodsName){
    this.goodsName = goodsName;
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
    public String getGoodsName(){
    return this.goodsName;
    }

    /**
    * 
    */
    public Double getAllMoney(){
    return this.allMoney;
    }

}
