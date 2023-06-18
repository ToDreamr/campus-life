package com.rain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rain.entity.exception.BaseException;
import com.rain.entity.pojo.shop.RainyShopGoodComment;
import com.rain.mapper.shop.RainyShopGoodCommentMapper;
import com.rain.service.RainyShopGoodCommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/4/24 16:33
 */
@Service
public class RainyShopGoodCommentServiceImpl extends ServiceImpl<RainyShopGoodCommentMapper, RainyShopGoodComment> implements RainyShopGoodCommentService {
    @Autowired
    RainyShopGoodCommentMapper commentMapper;
    @Override
    public RainyShopGoodComment post(RainyShopGoodComment comment) {
        if (comment.getUserId()<0|| StringUtils.isEmpty(comment.getContent())){
            throw new BaseException("评论失败，内容不能为空QaQ!！");
        }
        comment.setCommentTime(new Date());
        //选择字段数据自动填入或者手动填入
        commentMapper.insert(comment);
        return comment;
    }

    @Override
    public String delete(Integer id) {
        commentMapper.deleteById(id);
        return "删除成功";
    }

    @Override
    public RainyShopGoodComment modify(RainyShopGoodComment comment) {
       commentMapper.updateById(comment);
       return comment;
    }

    @Override
    public List<RainyShopGoodComment> list(Integer id) {
        RainyShopGoodComment byId = commentMapper.selectById(id);
        List<RainyShopGoodComment> list=new ArrayList<>();
        list.add(byId);
        return list;
    }
}
