package com.cykj.service;

import com.cykj.mapper.UserMapper;
import com.cykj.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String userName, String userPwd) {
        return userMapper.findUser(userName,userPwd);
    }
}
