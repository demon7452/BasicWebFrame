package com.service;

import com.dao.UserMapper;
import com.dao.entities.User;
import com.service.api.UserServiceApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserServiceApi {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(long id) {
        return userMapper.queryById(id);
    }
}
