package com.luckydb.service;

import com.luckydb.model.entity.UserEntity;

import java.util.List;

/**
* @Description:
* @Author: daibin
* @Date: 2020-04-18 22:01
*/
public interface UserService {

    /**
     *
     * 用户信息
     * @return
     */
    UserEntity getUserByUserId(String userId);

    /**
     * 用户列表
     * @return
     */
    List<UserEntity> getUserlist();

}


