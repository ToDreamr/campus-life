package net.rain.entity.pojo.shop;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 店铺信息表
* @TableName rainy_shop_info
*/
@ToString
@ApiModel(value = "店家信息",description = " ")
public class RainyShopInfo implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("词条信息id")
    private Integer id;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("店家名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String shopName;
    /**
    * 
    */
    @ApiModelProperty("排名")
    private Integer shopRank;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("店家类别")
    @Length(max= 10,message="编码长度不能超过10")
    private String shopType;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("店家图片")
    @Length(max= 255,message="编码长度不能超过255")
    private String shopImg;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("地址信息")
    @Length(max= 255,message="编码长度不能超过255")
    private String shopAddress;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 11,message="编码长度不能超过11")
    @ApiModelProperty("电话")
    @Length(max= 11,message="编码长度不能超过11")
    private String shopPhone;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("上市时间")
    private Date updateTime;

    /**
    * 
    */
    public void setId(Integer id){
    this.id = id;
    }

    /**
    * 
    */
    public void setShopName(String shopName){
    this.shopName = shopName;
    }

    /**
    * 
    */
    public void setShopRank(Integer shopRank){
    this.shopRank = shopRank;
    }

    /**
    * 
    */
    public void setShopType(String shopType){
    this.shopType = shopType;
    }

    /**
    * 
    */
    public void setShopImg(String shopImg){
    this.shopImg = shopImg;
    }

    /**
    * 
    */
    public void setShopAddress(String shopAddress){
    this.shopAddress = shopAddress;
    }

    /**
    * 
    */
    public void setShopPhone(String shopPhone){
    this.shopPhone = shopPhone;
    }

    /**
    * 
    */
    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
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
    public String getShopName(){
    return this.shopName;
    }

    /**
    * 
    */
    public Integer getShopRank(){
    return this.shopRank;
    }

    /**
    * 
    */
    public String getShopType(){
    return this.shopType;
    }

    /**
    * 
    */
    public String getShopImg(){
    return this.shopImg;
    }

    /**
    * 
    */
    public String getShopAddress(){
    return this.shopAddress;
    }

    /**
    * 
    */
    public String getShopPhone(){
    return this.shopPhone;
    }

    /**
    * 
    */
    public Date getUpdateTime(){
    return this.updateTime;
    }

}
