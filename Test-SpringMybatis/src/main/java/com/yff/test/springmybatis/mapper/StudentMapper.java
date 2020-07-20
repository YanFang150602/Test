package com.yff.test.springmybatis.mapper;

import com.yff.test.springmybatis.bean.Student;

import java.util.HashMap;

public interface StudentMapper {
    public void getClassesNameByStudentId(HashMap<String,Object> parameterMap);

    public void insertStudent(Student student);
}
