package com.xiong.service;

import com.xiong.api.UserApi;
import com.xiong.dao.UserDao;
import com.xiong.dao.entities.User;
import com.xiong.dao.entities.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements UserApi {

    @Resource
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }

    @Override
    public User findUserById(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> findALL() {
        UserExample userExample = new UserExample();
        return userDao.selectByExample(userExample);
    }
}
