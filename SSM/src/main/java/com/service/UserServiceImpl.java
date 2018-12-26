package com.service;

import com.dao.UserDao;
import com.dao.entities.User;
import com.dao.entities.UserExample;
import com.service.api.UserApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserApi {


    @Resource
    private UserDao userDao;

    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getAllUsers() {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdIsNotNull();

        return userDao.selectByExample(userExample);
    }
}
