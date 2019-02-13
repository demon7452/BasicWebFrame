package com.xiong.api;

import com.xiong.dao.entities.User;

import java.util.List;

public interface UserApi {

    void addUser(User user);

    User findUserById(Integer userId);

    List<User> findALL();
}
