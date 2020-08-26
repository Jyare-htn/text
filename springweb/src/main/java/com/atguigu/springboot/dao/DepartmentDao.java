package com.atguigu.springboot.dao;

import java.util.List;

import com.atguigu.springboot.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface DepartmentDao {

	//查询所有的部门信息
	@Select("select * from Department")
	List<Department> getDepartments();

	//根据部门id查询名字
	@Select("select * from Department where id = #{id}")
	Department getDepartment(Integer id);
}
