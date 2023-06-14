package com.rain.entity.pojo.shop;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
* 商品评论表
* @TableName rainy_shop_good_comment
*/
@ToString
@ApiModel(value = "关于店家的评论",description=" ")
public class RainyShopGoodComment implements Serializable {

    /**
    * 如果不设置主键自增策略，默认使用雪花算法
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("评论ID")
    @TableId(type = IdType.AUTO)//设置主键自增策略，添加方法为 注解 ，yml配置文件，或者建表的时候
    private Integer id;
    /**
    * 
    */
    @NotNull(message="[userId]不能为空")
    @ApiModelProperty("用户ID")
    private Integer userId;
    /**
    * 
    */
    @NotBlank(message="评论不能为空")
    @Size(max= 1000,message="编码长度不能超过1000")
    @ApiModelProperty("评论内容")
    @Length(max= 1000,message="编码长度不能超过1,000")
    private String content;
    /**
    * 
    */
//    @NotNull(message="[]不能为空")
    @ApiModelProperty("日期")
    @JSONField(format = "yyyy-MM-dd")//这个注解可以自动插入数据
    private Date commentTime;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("是否删除")
    @JSONField(defaultValue = "0")
    private Integer isdeleted;

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
    public void setContent(String content){
    this.content = content;
    }

    /**
    * 
    */
    public void setCommentTime(Date commentTime){
    this.commentTime = commentTime;
    }

    /**
    * 
    */
    public void setIsdeleted(Integer isdeleted){
    this.isdeleted = isdeleted;
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
    public String getContent(){
    return this.content;
    }

    /**
    * 
    */
    public Date getCommentTime(){
    return this.commentTime;
    }

    /**
    * 
    */
    public Integer getIsdeleted(){
    return this.isdeleted;
    }

}
