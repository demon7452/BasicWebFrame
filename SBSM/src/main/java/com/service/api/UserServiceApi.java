package com.service.api;

import com.dao.entities.User;

public interface UserServiceApi {

    User queryById(long id);
}
