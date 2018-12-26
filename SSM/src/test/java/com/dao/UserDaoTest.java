package com.dao;

import com.basic.BaseTest;
import com.dao.entities.User;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.Date;

public class UserDaoTest extends BaseTest {

    @Resource
    private UserDao userDao;

    @Test
    @Ignore
    public void query_by_id_test(){

        User user = new User();
        user.setName("xiong");
        user.setEmail("1234@qq.com");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        userDao.insertSelective(user);

        User userFind = userDao.selectByPrimaryKey(user.getId());

        Assert.assertNotNull(userFind);
    }
}