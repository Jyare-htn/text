package com.atguigu.springboot.controller;

import com.sun.deploy.security.UserDeclinedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionController {

    //浏览器客户端返回的都是json数据
//    @ResponseBody
//    @ExceptionHandler(UserDeclinedException.class)
//    public Map<String,Object> handException(Exception e){
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("code","user.notexist");
//        map.put("message",e.getMessage());
//        return map;
//    }


    @ExceptionHandler(UserDeclinedException.class)
    public String handException(Exception e){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code","user.notexist");
        map.put("message","用户出错了");
        //转发error
        return "forward:/error";
    }
}
