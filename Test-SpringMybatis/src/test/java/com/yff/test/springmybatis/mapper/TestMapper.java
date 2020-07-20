package com.yff.test.springmybatis.mapper;

import com.yff.test.springmybatis.bean.Classes;
import com.yff.test.springmybatis.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class TestMapper {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ClassesMapper classesMapper;

    @Test
    public void test(){
        HashMap<String,Object> parameterMap = new HashMap<String, Object>();
        parameterMap.put("studentId",1);
        parameterMap.put("classesName","");
        System.out.println(studentMapper);

        studentMapper.getClassesNameByStudentId(parameterMap);
        String classesName = (String)parameterMap.get("classesName");
        System.out.println(classesName);
    }

    @Test
    public void insertClasses() {
        Classes c = new Classes();
        c.setName("三年一班");
        classesMapper.insertClasses(c);
    }

    @Test
    public void insertStudent() {
        Classes c = classesMapper.queryClassesById(4);

        Student s = new Student();
        s.setName("YFf");
        s.setSex("女");
        s.setClasses(c);
        studentMapper.insertStudent(s);
    }
}
