package com.yff.test.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class DBUtil {
    public static SqlSession getSqlSession() throws IOException {
        InputStream is = Resources.getResourceAsStream("com/yff/test/mybatis/config/mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
        SqlSession ss = ssf.openSession();
        return ss;
    }
}
