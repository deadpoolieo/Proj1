package com.zihao.task1.service.impl;

import com.zihao.task1.entity.User;
import com.zihao.task1.mapper.UserMapper;
import com.zihao.task1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user){
        userMapper.insert(user);
    }
}
