package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.DepartmentDao;
import com.atguigu.springboot.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.springboot.service.DepartmentService;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> getDepartments() {
        return departmentDao.getDepartments();
    }

    @Override
    public Department getDepartment(Integer id) {
        return departmentDao.getDepartment(id);
    }
}
