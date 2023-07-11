package net.rain.entity.pojo.shop;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
* 店铺分类
* @TableName rainy_shop_classify
*/
@ToString
@ApiModel(value = "商家分类",description = "")
public class RainyShopClassify implements Serializable {

    /**
    * 
    */
    @NotBlank(message="[shopType]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("商家分类")
    @Length(max= 255,message="编码长度不能超过255")
    private String shopType;
    /**
    * 
    */

    //整数类型参数校验只可以采用@NotNull,其他注解判空是支持 字符串而不是整数类型
    @ApiModelProperty("商家唯一ID")
    @NotNull(message="[id]不能为空")
    private Integer id;

    /**
     *
     */
    @ApiModelProperty("状态")
    @NotNull(message="[status]不能为空")
    @Getter
    @Setter
    private Integer status;

    /**
     *
     */
    @ApiModelProperty("排名")
    @NotNull(message="[sort]不能为空")
    @Getter
    @Setter
    private Integer sort;

    /**
     *
     */
    @ApiModelProperty("修改时间")
//    @NotNull(message="[时间]不能为空")
    @Getter
    @Setter
    //转化字段问题
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy年MM月dd日 HH:mm:ss")
    private LocalDateTime modifyTime;

    /**
    * 
    */
    public void setShopType(String shopType){
    this.shopType = shopType;
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
    public String getShopType(){
    return this.shopType;
    }

    /**
    * 
    */
    public Integer getId(){
    return this.id;
    }

}
