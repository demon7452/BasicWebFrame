package com.dao;

import com.basic.BaseTest;
import com.basic.dao.UserDao;
import com.basic.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;


    @Test
    public void query_by_id_test(){
        int user_id = 1;

        User user = userDao.queryById(user_id);

        Assert.assertNotNull(user);
    }

}