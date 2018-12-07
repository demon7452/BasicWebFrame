package com.basic.dao;

import com.basic.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User queryById(@Param("id") int id);
}
