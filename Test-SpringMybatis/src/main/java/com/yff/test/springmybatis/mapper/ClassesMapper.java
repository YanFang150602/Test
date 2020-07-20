package com.yff.test.springmybatis.mapper;

import com.yff.test.springmybatis.bean.Classes;
import com.yff.test.springmybatis.bean.Student;

import java.util.HashMap;

public interface ClassesMapper {
    public void insertClasses(Classes classes);
    public Classes queryClassesById(int id);
}
