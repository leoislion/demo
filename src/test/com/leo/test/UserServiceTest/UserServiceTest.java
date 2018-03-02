package com.leo.test.UserServiceTest;

import com.leo.entity.User;
import com.leo.service.IUserSerivce;
import com.leo.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserServiceTest extends BaseTest {
    @Autowired
    IUserSerivce userSerivce;
    @Test
    public void insertUserTest(){
        User user=new User();
        user.setAddress("xxxx");
        user.setBirthday(new Date());
        user.setUsername("leo");
        user.setSex("M");
        boolean bool=userSerivce.insertUser(user);
        if(bool) {
            System.out.println("excellent----------------------------------");
        }else {
            System.out.println("what the fuck++++++++++++++++++++++++++++");
        }
    }
}
