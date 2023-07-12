package net.rain.entity.pojo.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 历史订单
* @TableName rainy_user_history_orders
*/
@ToString
@ApiModel(value = "用户历史订单",description = "")
public class RainyUserHistoryOrders implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("历史订单号")
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
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("商品名")
    @Length(max= 255,message="编码长度不能超过255")
    private String goodsName;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("总价")
    private Double allMoney;

    private String phone;

    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy年MM月dd日 HH:mm:ss")
    private Date orderTime;

    private int orderStatus;

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }



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
