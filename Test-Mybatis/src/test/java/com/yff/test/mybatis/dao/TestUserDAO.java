package com.yff.test.mybatis.dao;


import com.yff.test.mybatis.bean.Level;
import com.yff.test.mybatis.bean.User;
import org.junit.Test;

import java.util.List;

public class TestUserDAO {

    @Test
    public void testQueryUser(){
        UserDAO userDAO = new UserDAO();
        List<User> userList = userDAO.queryAllUser();
        for (User u : userList) {
            System.out.println(u.toString());
        }
    }
    
    @Test
    public void testInsertOne() {
    	Level level = new Level();
    	level.setId(5);
    	
    	User user = new User();
    	user.setId(1);
    	user.setNo("2001");
    	user.setName("รรรร");
    	user.setGender("ลฎ");
    	user.setLevel(level);
    	UserDAO userDAO = new UserDAO();
    	userDAO.insertOneUser(user);
    	
    	
    }
}
