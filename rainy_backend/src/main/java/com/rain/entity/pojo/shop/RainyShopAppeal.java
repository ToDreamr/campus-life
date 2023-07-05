package com.rain.entity.pojo.shop;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/7/3 10:37
 */
@Data
@ApiModel(value = "申述管理实体",description ="")
public class RainyShopAppeal implements Serializable {

    /*
    * 顾客姓名*/
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("顾客姓名")
    @Length(max= 255,message="编码长度不能超过255")
    String username;

    /** 图片
     *
     */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("图片")
    @Length(max= 255,message="编码长度不能超过255")
    String imgUrl;

    /**
     *消费数额
     */
    @NotNull(message="[]不能为空")
    BigDecimal money;

    /**
     * 顾客评论
     */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("评论")
    @Length(max= 255,message="编码长度不能超过255")
    String comment;

    /**
     * 活跃状态
     */
    @NotNull(message="[]不能为空")
    Integer activeOrNot;

    @NotNull(message = "[该项目不能为空]")
    @ApiModelProperty("申诉单号")
    Integer id;
}
