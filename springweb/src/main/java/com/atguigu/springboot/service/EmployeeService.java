package com.atguigu.springboot.service;

import com.atguigu.springboot.entities.Employee;

import java.util.Collection;

public interface EmployeeService {
    //获取全部员工信息
    Collection<Employee> getAll();

    //根据id获得员工信息
    Employee get(Integer id);

    //根据name获取员工信息
   // Employee getBynMame(String lastname);

    //根据id删除
    int delete(Integer id);

    //添加
   int add(Employee employee);

    //修改
   int update(Employee employee);
}
