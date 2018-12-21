package com.service;

import com.dao.UserDao;
import com.dao.entities.User;
import com.service.api.UserServiceApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserServiceApi {

    @Resource
    private UserDao userDao;

    @Override
    public User queryById(long id) {
        return userDao.selectByPrimaryKey(id);
    }
}
