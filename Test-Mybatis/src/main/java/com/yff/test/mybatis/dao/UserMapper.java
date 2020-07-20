package com.yff.test.mybatis.dao;

import com.yff.test.mybatis.bean.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryAllUser();
    
    public void insetOneUser(User user);
}
