package com.atguigu.springboot.controller;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.atguigu.springboot.service.impl.DepartmentServiceImpl;
import com.atguigu.springboot.service.impl.EmployeeServiceImpl;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;
    @Autowired
    private DepartmentServiceImpl departmentService;

    //查询所有员工，返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
       Collection<Employee> employees = employeeService.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
    //按名查询员工
    @GetMapping("/empid/{empid}")
    public String listById(Model model,@PathVariable("empid") Integer empid){
        Employee employees = employeeService.get(empid);
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面，查出所有的部门，在页面显示
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //员工添加
    //SpringMvc自动将请求参数和入参对象的属性进行一一绑定
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //来到员工列表
        employeeService.add(employee);
        //redirect:表示重定向到一个地址  /就代表当前项目路径
        //forward:表示转发到一个地址
        return "redirect:/emps";
    }

    //来到修改页面，查出当前元，在页面回显
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeService.get(id);
        model.addAttribute("emp",employee);

        //页面要显示所有的部门列表
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);

        //回到修改页面(add是一个修改添加二合一的页面)
        return "emp/add";
    }

    //员工修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee,Model model ){
        employeeService.update(employee);
        Employee emp = employeeService.get(employee.getId());
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return "redirect:/emps";
    }

}
