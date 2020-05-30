package com.luckydb.controller;

import com.luckydb.constant.Result;
import com.luckydb.model.entity.UserEntity;
import com.luckydb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: 用户管理
* @Author: daibin
* @Date: 2020-04-18 21:14
*/
@Api(tags = "用户管理-用户信息")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @PostMapping("/getUserlist")
    @ApiOperation(value = "用户列表")
    public Result<List<UserEntity>> getUserlist (){
        return Result.success(userService.getUserlist());
    }

    @PostMapping("/getUserByUserId")
    @ApiOperation(value = "用户信息")
    public Result<UserEntity> getUserByUserId (@RequestBody String userId){
        return Result.success(userService.getUserByUserId(userId));
    }

}
