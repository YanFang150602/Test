package com.yff.test.mybatis.dao;

import com.yff.test.mybatis.bean.User;
import com.yff.test.mybatis.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class UserDAO {

    public List<User> queryAllUser(){
        try {
            SqlSession ss = DBUtil.getSqlSession();
            UserMapper um = ss.getMapper(UserMapper.class);
            List<User> userList = um.queryAllUser();
            return userList;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void insertOneUser(User user) {
    	SqlSession ss;
		try {
			ss = DBUtil.getSqlSession();
	    	UserMapper um = ss.getMapper(UserMapper.class);
	    	um.insetOneUser(user);
	    	ss.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
