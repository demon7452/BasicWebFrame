package com.service.api;

import com.dao.entities.User;

import java.util.List;

public interface UserApi {

    User selectByPrimaryKey(Integer id);

    List<User> getAllUsers();
}
