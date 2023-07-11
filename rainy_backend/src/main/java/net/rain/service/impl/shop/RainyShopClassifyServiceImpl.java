package net.rain.service.impl.shop;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopClassify;
import net.rain.mapper.shop.RainyShopClassifyMapper;
import net.rain.service.shop.RainyShopClassifyService;
import net.rain.service.common.ValidService;
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
    @Autowired
    ValidService validService;

    public Result<RainyShopClassify> modifyClassify(RainyShopClassify classify){
        return validService.modifyByIdAndMapper(classify,classifyMapper, classify.getId());
    }

    @Override
    public Result<RainyShopClassify> postClassify(RainyShopClassify classify) {
        return validService.postByIdAndMapper(classify, classify.getId(),classifyMapper);
    }

    @Override
    public Result<List<RainyShopClassify>> remove(Integer id) {
        return validService.deleteByIdAndMapper(id,classifyMapper);
    }
}
