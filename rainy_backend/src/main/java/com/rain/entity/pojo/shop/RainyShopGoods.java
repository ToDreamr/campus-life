package com.rain.entity.pojo.shop;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
* 商品表
* @TableName rainy_shop_goods
*/
@ToString
@ApiModel("商家的销售商品")
public class RainyShopGoods implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("商店商品标号")
    private Integer id;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("商品名称")
    @Length(max= 255,message="编码长度不能超过255")
    private String goodsName;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("商品价格")
    private Double goodsPrice;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("图片")
    @Length(max= 255,message="编码长度不能超过255")
    private String goodsImage;
    /**
    * 
    */
    @Size(max= 1000,message="编码长度不能超过1000")
    @ApiModelProperty("描述")
    @Length(max= 1000,message="编码长度不能超过1,000")
    private String goodsDescription;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("是否下架")
    public Integer goodsIsdroped;



    /**
     * 
     */
    @NotNull(message="[]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("名称")
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
    this.goodsDescription = goodDescription;
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
    return this.goodsDescription;
    }

    /**
    * 
    */
    public Integer getGoodsIsdroped(){
    return this.goodsIsdroped;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
