# SpringBoot独立开发项目

## 项目名称:基于多业务集成的校园生活网站

> ### 拟定需要实现的业务模块：
>
> ##### 电商模块：
>
> 1:商家发布商品，实现对各个商店的独立商品管理。商家有分类，包括餐饮，娱乐电影，书店等等。
> 2：商家可以管理自己商家下的员工，完成基本的CURD。
> 3：实现评论功能，用户下单后才可以评论，评论的内容应该包括可以上传文字或者图片
>
> ###### 生活模块：
>
> 1：仿照QQ动态?用户可以晒出日常生活状态，图片文字等
> 2:对商家的菜品实现评论功能，通常是在完成探店之后才可以评论，添加地址服务，可以显示当前位置。
>
> ###### 子模块：
>
> 3:属于生活模块：开发一个景点探索模块，用户在完成景点的游玩之后可以发布动态进行点评到大厅，广播给所有用户。==》分出一个景点的表。同时其他用户可以评论。
> 4:要实现关注功能，用户关注了商店或者博主，同时自己可以被关注成为博主。

### **技术选型：**

#### SpringBoot，Mybatis-plus，Mysql，Redis(关注，验证等)，Mail,Swagger,EasyExcel(导出热点数据，商店关注用户表，实现店铺和博主的一些数据分析) ，权限：JWT+token,Scheduled定时计划实现店铺的商品上架下架关店。

####前端：Html+Css+BootStrap+axios+ajax+vue

#### 完善后考虑：Linux+Nginx+Docker  Es模糊关键词搜索 MongoDb

#### 项目组织架构拟定为单体项目，开发周期 ：2023-6-15  == 2023-7-20

### 数据库设计（表名：前缀prefix=rainy_）：

分析 ：

>商家分类表:shop_classify，商家员工表:shop_employee，商家商品表shop_goods ，商店商品评论表shop_goods_comments,商店表：shop_info,订单表shop_orders

>用户表：基础用户表user,历史下单表user_history_orders,评论表user_comments，基础信息表user_info

#### 初步设计字段：
>
>| 数据库字段设计                                                                                                                              
>| shop_orders表:id，order_time，user_address,user_phone,all_money,user_id,goods_name                                                          
>| shop_info表:shop_name,shop_rank（店铺排名）,shop_type（店铺主营业务）,shop_img,shop_address（店铺地址）,shop_phone,id，update_time(开店时间)
>| shop_classify表:shop_type（店铺主营业务）,id                                                                                                 
>| shop_employee表:employee_name,id,username(唯一),password,isdroped(是否解雇？0是，1否),phone,email,gender                                  
>| shop_goods表：id,goods_name,goods_price,goods_image,goods_description,goods_isdroped(是否上架？0是，1否)                                 
>| shop_good_comment表:id，user_id（评论人的）id）,content,comment_time,isdeleted(是否删除评论？yes:1,not:0)                                    
>| user表:id,username,password,email,nick_name,user_role(1为管理员admin),user_id                                                       
>| user_history_orders表:id,user_id,goods_name,all_money                                                                           
>| userinfo表：signature(签名)，user_id，gender,user_phone，id                                                                           
>|                                                                                                                                
>
#### 降低耦合度，明确分工Service和Mapper
### 项目亮点：

调用逻辑关系：控制层调用Service,
Service通过统一公共方法ValidService来调用Mapper层面，降低了耦合度
和重复性代码的编写

> 远程调用:Remote Procedure Call（RPC）
> 远程过程调用，通过连接对方服务器来时线请求和响应
> 交互，这样的按照Http请求协议或其他协议来实现调用，这样的东西叫做远程调用

# 捐赠

开源项目不易，若此项目能得到你的青睐，可以捐赠支持作者持续开发与维护，感谢所有支持开源的朋友。

<img src="rainy_backend/src/main/resources/md/vx.png" alt="img.png" style="zoom:25%;" /> <img src="rainy_backend/src/main/resources/md/zfb.png" alt="img_2.png" style="zoom:25%;" />

## 捐赠列表（有遗漏的请及时联系作者）
|捐赠者|金额|留言|时间|
|:---:|:---:|:---:|:---:|
|春江花朝秋月夜|￥88.88 |请大佬喝咖啡|2023-05-28 15:53|



