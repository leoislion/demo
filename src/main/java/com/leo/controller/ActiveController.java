package com.leo.controller;

import com.leo.entity.User;
import com.leo.service.IUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping(value = "/user")
public class ActiveController {

    @Autowired
    IUserSerivce userSerivce;
    @RequestMapping(value="/getUser")
    public ModelAndView insertUser(){
        ModelAndView modelAndView=new ModelAndView("index/index");
        User user=new User();
        user.setAddress("xxxx");
        user.setBirthday(new Date());
        user.setUsername("leo");
        user.setSex("M");
        boolean bool=userSerivce.insertUser(user);
        if(bool) {
            System.out.println("wo kao----------------------------------");
        }else {
            System.out.println("what the fuck++++++++++++++++++++++++++++");
        }
        return modelAndView;
    }

}
