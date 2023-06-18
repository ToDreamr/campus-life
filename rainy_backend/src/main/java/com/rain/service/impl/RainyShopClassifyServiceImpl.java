package com.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.common.Result;
import com.rain.entity.exception.BaseException;
import com.rain.entity.pojo.shop.RainyShopClassify;
import com.rain.mapper.shop.RainyShopClassifyMapper;
import com.rain.service.RainyShopClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:30
 */
@Service
public class RainyShopClassifyServiceImpl extends ServiceImpl<RainyShopClassifyMapper, RainyShopClassify> implements RainyShopClassifyService {
    //分类依赖：
    @Autowired
    RainyShopClassifyMapper classifyMapper;

    public String modifyClassify(RainyShopClassify classify){
        RainyShopClassify getByID = classifyMapper.selectById(classify.getId());
        try{
            if(getByID!=null){
                classifyMapper.updateById(classify);
                return  "修改分类成功！";
            }else return "不存在这样的分类！";
        }catch(Exception exception){
            return "未知的修改异常错误";
        }
    }

    @Override
    public Result<RainyShopClassify> postClassify(RainyShopClassify classify) {

        try {
            //先判断是否存在这样的分类
            // if (classify.getId()==null||classify.getShopType()==null){
            //     return Result.errorMsg("缺少必要的参数！");
            // }
            LambdaQueryWrapper<RainyShopClassify> QueryWrapper = new LambdaQueryWrapper<>();
            QueryWrapper.eq(RainyShopClassify::getId,classify.getId());
            QueryWrapper.eq(RainyShopClassify::getShopType,classify.getShopType());

            RainyShopClassify shopClassify = classifyMapper.selectById(classify.getId());
            if (shopClassify==null){
                classifyMapper.insert(classify);
                return Result.success("添加分类成功！",classify);
            }
            return Result.errorMsg("已经存在相同的分类，无须继续添加该类型");
        }catch (Exception  e){
            e.printStackTrace();
            return Result.errorMsg("未知的添加异常");
        }
    }

    @Override
    public Result<List<RainyShopClassify>> remove(Integer id) {
        try {
            LambdaQueryWrapper<RainyShopClassify> lambdaQueryWrapper=new LambdaQueryWrapper<>();
            //查询是否有相关联ID的分类
            lambdaQueryWrapper.eq(RainyShopClassify::getId,id);
            List<RainyShopClassify> list = classifyMapper.selectList(lambdaQueryWrapper);
            if (list!=null){
                if (classifyMapper.delete(lambdaQueryWrapper)!=0)
                    return Result.success("删除成功",list);//返回删除的分类和响应信息
                return Result.errorMsg("删除失败");
            }
            return Result.errorMsg("不存在这样的分类，请重新输入！");
        }catch (Exception e){
            throw new BaseException("未知删除的异常错误");
        }
    }
}
