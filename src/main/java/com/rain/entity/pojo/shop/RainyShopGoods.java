package com.rain.entity.pojo.shop;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 商品表
* @TableName rainy_shop_goods
*/
@ToString
public class RainyShopGoods implements Serializable {

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
    private String goodsName;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Double goodsPrice;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String goodsImage;
    /**
    * 
    */
    @Size(max= 1000,message="编码长度不能超过1000")
    @ApiModelProperty("")
    @Length(max= 1000,message="编码长度不能超过1,000")
    private String goodDescription;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    public Integer goodsIsdroped;

    /**
     * 
     */
    @NotNull(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String shopName;

    /**
    * 
    */
    public void setId(Integer id){
    this.id = id;
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
    public void setGoodsPrice(Double goodsPrice){
    this.goodsPrice = goodsPrice;
    }

    /**
    * 
    */
    public void setGoodsImage(String goodsImage){
    this.goodsImage = goodsImage;
    }

    /**
    * 
    */
    public void setGoodDescription(String goodDescription){
    this.goodDescription = goodDescription;
    }

    /**
    * 
    */
    public void setGoodsIsdroped(Integer goodsIsdroped){
    this.goodsIsdroped = goodsIsdroped;
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
    public String getGoodsName(){
    return this.goodsName;
    }

    /**
    * 
    */
    public Double getGoodsPrice(){
    return this.goodsPrice;
    }

    /**
    * 
    */
    public String getGoodsImage(){
    return this.goodsImage;
    }

    /**
    * 
    */
    public String getGoodDescription(){
    return this.goodDescription;
    }

    /**
    * 
    */
    public Integer getGoodsIsdroped(){
    return this.goodsIsdroped;
    }

}
