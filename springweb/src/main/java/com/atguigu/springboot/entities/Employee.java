package com.atguigu.springboot.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private String departmentName;
    private Integer departmentId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth = new Date();

	
}
