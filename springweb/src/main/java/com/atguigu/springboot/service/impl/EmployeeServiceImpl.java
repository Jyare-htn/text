package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.EmployeeDao;
import com.atguigu.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.springboot.service.EmployeeService;

import java.util.Collection;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Collection<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee get(Integer id) {
        return employeeDao.get(id);
    }

//    @Override
//    public Employee getBynMame(String lastname) {
//        return employeeDao.getBynMame(lastname);
//    }

    @Override
    public int delete(Integer id) {
        return employeeDao.delete(id);
    }

    @Override
    public int add(Employee employee) {
        return employeeDao.add(employee);
    }

    @Override
    public int update(Employee employee) {
        return employeeDao.update(employee);
    }
}
