package net.rain.service.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.rain.entity.common.Result;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/6/24 11:03
 */

public interface ValidService<T> {
    Result<List<T>> deleteByIdAndMapper(int id, BaseMapper mapper);

    Result<Object> modifyByIdAndMapper(T t, @NotNull BaseMapper mapper, int id);

    Result<Object> postByIdAndMapper(T t,Integer id,BaseMapper mapper);


}
