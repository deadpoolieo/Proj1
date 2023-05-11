package com.proj1.service.impl;



import com.proj1.entity.User;
import com.proj1.mapper.UserMapper;
import com.proj1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}
