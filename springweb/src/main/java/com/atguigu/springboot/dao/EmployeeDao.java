package com.atguigu.springboot.dao;

import java.util.Collection;
import com.atguigu.springboot.entities.Employee;
import lombok.Data;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface EmployeeDao {

	//获取全部员工信息
    @Select("select employee.*, department.departmentName\n" +
            "FROM\n" +
            "employee inner JOIN department\n" +
            "on employee.departmentId = department.id\n"+
            "order by employee.id ")
	Collection<Employee> getAll();

	//根据id获得员工信息
    @Select("select * from Employee where id = #{id}")
	Employee get(Integer id);

    //根据name获得员工信息
//    @Select("select employee.*, department.departmentName\n" +
//            "FROM\n" +
//            "employee left JOIN department\n" +
//            "on employee.departmentId = department.id\n"+
//            " where lastname like #{lastname}")
//    Employee getBynMame(String lastname);

	//根据id删除
    @Delete("delete from Employee where id = #{id}")
	int delete(Integer id);

    //添加
    @Insert("insert into Employee(lastName,email,gender,departmentId,birth) values(#{lastName},#{email},#{gender},#{departmentId},#{birth})")
    int add(Employee employee);

	//修改
    @Update("update Employee set lastName=#{lastName},email=#{email},gender=#{gender},departmentId=#{departmentId},birth=#{birth} where id = #{id}")
    int update(Employee employee);
}
