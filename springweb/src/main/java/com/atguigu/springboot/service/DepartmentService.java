package com.atguigu.springboot.service;

import com.atguigu.springboot.entities.Department;

import java.util.List;

public interface DepartmentService {
    //查询所有的部门信息
    List<Department> getDepartments();

    //根据部门id查询名字
    Department getDepartment(Integer id);
}
