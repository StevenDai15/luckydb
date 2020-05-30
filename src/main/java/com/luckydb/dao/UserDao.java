package com.luckydb.dao;

import com.luckydb.model.entity.UserEntity;

import java.util.List;

//@Mapper
public interface UserDao {

    UserEntity getUserByUserId(String userId);

    List<UserEntity> getUserlist();
}
