package net.rain.controller.user;

import net.rain.entity.common.Result;
import net.rain.entity.pojo.shop.RainyShopGoodComment;

import net.rain.service.shop.RainyShopGoodCommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2023/5/17 20:58
 */
@RestController
@RequestMapping("/user")
public class CommentController {
    @Resource
    RainyShopGoodCommentService commentService;

    //评论店家
    @PostMapping("/submit")
    @ResponseBody
    @ApiOperation(value = "发评论")
    public Result<RainyShopGoodComment> post(@RequestBody  @Validated RainyShopGoodComment comment){
        return Result.message(commentService.post(comment),200,"评论成功");
    }

    //删除评论
    @DeleteMapping("/{id}")
    @ResponseBody
    public Result<String> delete(@PathVariable @Validated Integer id){
        return  Result.success(commentService.delete(id));
    }

    @PutMapping("/modify")
    @ResponseBody
    public Result<RainyShopGoodComment> modify(@RequestBody RainyShopGoodComment comment){
        return Result.success("修改成功",commentService.modify(comment));
    }

    @GetMapping("/list/{id}")
    @ResponseBody
    public Result<List<RainyShopGoodComment>> list(@PathVariable Integer id){
        return Result.success(commentService.list(id));
    }
}
