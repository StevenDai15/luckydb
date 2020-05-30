package com.luckydb.service.impl;

import com.luckydb.dao.UserDao;
import com.luckydb.model.entity.UserEntity;
import com.luckydb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description:userService实现类
* @Author: daibin
* @Date: 2020-04-18 22:07
*/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserDao userDao;

    /**
     * 查询用户信息
     * @return
     */
    @Override
    public UserEntity getUserByUserId(String userId){
        UserEntity userInfo = userDao.getUserByUserId(userId);
        return userInfo;
    }

    /**
     * 查询用户列表
     * @return
     */
    @Override
    public List<UserEntity> getUserlist(){
        List<UserEntity> userlist = userDao.getUserlist();
        return userlist;
    }

}