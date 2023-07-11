package net.rain.service.impl.common;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.rain.entity.common.Result;
import net.rain.service.common.ValidService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/24 0:32
 */
@Service
//写一套增删改查的复用代码
public class ValidServiceImpl<T> extends LambdaQueryWrapper<T> implements ValidService {
    public Result<List<T>> deleteByIdAndMapper(int id, BaseMapper mapper){
        if (mapper.selectById(id)==null){
            return Result.errorMsg("不存在这样的ID");
        }
        try {
            mapper.deleteById(id);
            return Result.success("删除成功",mapper.selectList(new ValidServiceImpl()));//使用了直接继承的queryWrapper
        }catch (Exception e){
            e.printStackTrace();
            return Result.errorMsg("内部服务错误");
        }
    }

   public Result<Object> modifyByIdAndMapper(Object t, @NotNull BaseMapper mapper, int id){
        //修改填入的信息
        //检查修改是否合法
        //获取ID
        //最后返回修改好的数据
        try {
            mapper.updateById(t);
            return Result.success("修改信息完成",mapper.selectById(id));
        }catch (Exception e){
            e.printStackTrace();
            return Result.errorMsg("修改失败");
        }
    }

   public Result<Object> postByIdAndMapper(Object t, Integer id, BaseMapper mapper){
        try {
            if (mapper.selectById(id)!=null) {
                return Result.errorMsg("已存在，无需继续添加");
            }
            mapper.insert(t);
            return Result.success("添加成功",t);
        }catch (Exception e){
            e.printStackTrace();
            return Result.errorMsg("添加失败，存在内部服务异常");
        }
    }
}
