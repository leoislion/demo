package com.leo.service.impl;

import com.leo.dao.mapper.UserMapper;
import com.leo.entity.User;
import com.leo.service.IUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements IUserSerivce {
    @Autowired
    UserMapper userMapper;
    public Boolean insertUser(User user) {
        return userMapper.insert(user)==1?true:false;
    }
}
